![logoimage](https://raw.githubusercontent.com/DominoKit/DominoKit.github.io/master/logo/128.png)

<a title="Gitter" href="https://gitter.im/DominoKit/domino"><img src="https://badges.gitter.im/Join%20Chat.svg"></a>
[![Development Build Status](https://github.com/DominoKit/domino-keycloak/actions/workflows/deploy.yaml/badge.svg?branch=development)](https://github.com/DominoKit/domino-keycloak/actions/workflows/deploy.yaml/badge.svg?branch=development)
![Maven Central](https://img.shields.io/badge/Release-2.0.0-green)
![Sonatype Nexus (Snapshots)](https://img.shields.io/badge/Snapshot-HEAD--SNAPSHOT-orange)
![GWT3/J2CL compatible](https://img.shields.io/badge/GWT3/J2CL-compatible-brightgreen.svg)

# domino-keycloak
JsInterop wrapper around the Keycloak JavaScript adapter for GWT3/J2CL apps.

This project exposes the Keycloak JS API as native Java interfaces and classes,
so you can interact with authentication flows, tokens, and account management
from your J2CL code without writing JS glue.

## Contents
- Features
- Requirements
- Install
- GWT module
- Loading the adapter
- Creating a Keycloak instance
- Initialization and auth flow
- Token refresh
- Events and callbacks
- Options and constants
- Roles, profile, and user info
- Build

## Features
- Native JsInterop bindings for the official Keycloak JS adapter
- Compatible with GWT3/J2CL and Elemental2
- Covers init/login/logout/register/account flows, token handling, and events
- Lightweight: no runtime logic beyond interop bindings

## Requirements
- Java 17 or newer
- A Keycloak server and a configured client
- The Keycloak JS adapter (`keycloak.js`) available at runtime
- GWT3/J2CL build with Elemental2

The authoritative API source is the official `keycloak-js` package from NPM,
currently version `26.2.4`, and its `lib/keycloak.d.ts` declaration file. The
checked-in externs are synchronized with that declaration.

## Install

- **Release**

```xml
<dependency>
    <groupId>org.dominokit</groupId>
    <artifactId>domino-keycloak</artifactId>
    <version>[release-version]</version>
</dependency>
```

- **Development snapshot**
```xml
<dependency>
    <groupId>org.dominokit</groupId>
    <artifactId>domino-keycloak</artifactId>
    <version>HEAD-SNAPSHOT</version>
</dependency>
```

## GWT module

```xml
<inherits name="org.dominokit.keycloak"/>
```

## Loading the adapter
Make sure the `keycloak.js` adapter is loaded in your HTML page before your
compiled J2CL bundle runs. You can load it from the Keycloak server:

```
<script src="https://{your-keycloak-host}/js/keycloak.js"></script>
```

## Creating a Keycloak instance
There are two ways to create a `Keycloak` instance:

1) By passing a URL pointing to the Keycloak adapter configuration JSON.
This JSON can be obtained from the Keycloak admin console:
Realm -> Clients -> (select client) -> Action menu -> "Download adapter config".

```java
Keycloak KEYCLOAK =
    new Keycloak(Keycloak.KeycloakConfigUnionType.of("https://example/config.json"));
```

2) By passing a `KeycloakConfig` object with server URL, realm, and client ID.
Keycloak will resolve the configuration from the server.

```java
KeycloakConfig config = KeycloakConfig.create(
    "https://{your-keycloak-host}",
    "{realm-id}",
    "{client-id}"
);
Keycloak KEYCLOAK = new Keycloak(Keycloak.KeycloakConfigUnionType.of(config));
```

The official adapter also supports the generic OIDC config shape exposed by
`KeycloakOidcConfig`.

## Initialization and auth flow
Use `KeycloakInitOptions` and the promise-based API to initialize and drive login.
`KeycloakInitOptions.create()` sets defaults for `useNonce`, `onLoad`,
`checkLoginIframeInterval`, `responseMode`, `silentCheckSsoFallback`, and
`enableLogging`.
`KEYCLOAK.init()` with no arguments is also supported.

```java
KeycloakInitOptions initOptions = KeycloakInitOptions.create();
initOptions.setOnLoad(KeycloakOnLoadUnionType.login_required());
initOptions.setCheckLoginIframe(true);

KEYCLOAK
    .init(initOptions)
    .then(authenticated -> {
      if (authenticated) {
        console.info("User authenticated.");
      } else {
        KEYCLOAK.login(KeycloakLoginOptions.create());
      }
    })
    .catch(error -> console.error("Failed to init keycloak."));
```

## Token refresh
Use `updateToken` before making calls that need a fresh token.

```java
KEYCLOAK.updateToken(30)
    .then(refreshed -> console.info("Token refreshed: " + refreshed))
    .catch(error -> console.error("Token refresh failed"));
```

## Events and callbacks
Hook into Keycloak events using the setter methods on `Keycloak`:
- `setOnReady(OnReadyEventCallback)`
- `setOnAuthSuccess(EventCallback)`
- `setOnAuthError(OnAuthErrorEventCallback)`
- `setOnAuthRefreshSuccess(EventCallback)`
- `setOnAuthRefreshError(EventCallback)`
- `setOnAuthLogout(EventCallback)`
- `setOnTokenExpired(EventCallback)`
- `setOnActionUpdate(OnActionUpdateEventCallback)`

## Options and constants
Keycloak options are modeled as native interfaces:
- `KeycloakInitOptions`
- `KeycloakLoginOptions`
- `KeycloakLogoutOptions`
- `KeycloakRegisterOptions`
- `KeycloakAccountOptions`
- `KeycloakRedirectUriOptions`
- `KeycloakOidcConfig`
- `KeycloakOpenIdProviderMetadata`

Union-type constants are provided as static factory methods:
- `KeycloakOnLoadUnionType.login_required()`, `check_sso()`
- `KeycloakFlowUnionType.standard()`, `implicit()`, `hybrid()`
- `KeycloakResponseModeUnionType.query()`, `fragment()`
- `KeycloakResponseTypeUnionType.code()`, `id_token__token()`, `code__id_token__token()`
- `KeycloakPromptUnionType.login()`, `none()`, `consent()`
- `KeycloakLogoutMethodUnionType._GET()`, `_POST()`
- `KeycloakPkcsMethodUnionType._S256()`, `_false()`
- `KeycloakAdapterUnionType._default()`, `cordova()`, `cordova_native()`,
  `adapter(KeycloakAdapter)`

## Roles, profile, and user info
- Realm roles: `keycloak.realmAccess` and `keycloak.hasRealmRole(...)`
- Resource roles: `keycloak.resourceAccess` and `keycloak.hasResourceRole(...)`
- User profile: `keycloak.loadUserProfile()`
- Profile attributes: `KeycloakProfile.getAttributes()` returns `KeycloakProfileAttributes`
- User info: `keycloak.loadUserInfo()` returns `KeycloakUserInfo` with typed OpenID claims and map-style access for extra claims

Parsed token data is exposed via `KeycloakTokenParsed` (`tokenParsed`,
`refreshTokenParsed`, and `idTokenParsed`).

## Build
The project is a `gwt-lib` Maven module. The GWT module name is
`org.dominokit.keycloak`. Typical build:

```
mvn -Pdev verify
```

## License
Apache 2.0. See `LICENSE`.
