![logoimage](https://raw.githubusercontent.com/DominoKit/DominoKit.github.io/master/logo/128.png)

<a title="Gitter" href="https://gitter.im/DominoKit/domino"><img src="https://badges.gitter.im/Join%20Chat.svg"></a>
[![Development Build Status](https://github.com/DominoKit/domino-keycloak/actions/workflows/deploy.yaml/badge.svg?branch=development)](https://github.com/DominoKit/domino-keycloak/actions/workflows/deploy.yaml/badge.svg?branch=development)
![Maven Central](https://img.shields.io/badge/Release-2.0.0-green)
![Sonatype Nexus (Snapshots)](https://img.shields.io/badge/Snapshot-HEAD--SNAPSHOT-orange)
![GWT3/J2CL compatible](https://img.shields.io/badge/GWT3/J2CL-compatible-brightgreen.svg)

# domino-keycloak
JsInterop wrapper for keycloak

### Maven dependency 

- **Release**

```xml
<dependency>
    <groupId>org.dominokit</groupId>
    <artifactId>domino-keycloak</artifactId>
    <version>2.0.0</version>
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
### GWT inherits 

```xml
<inherits name="org.dominokit.keycloak"/>
```

### Usage
- Make sure the `keycloak.js` [adapter](https://www.keycloak.org/downloads) is loaded in your html page.
  > The js file can also be loaded directly from the running keycloak instance under the path `[url to your keycloak instance]/js/keycloak.js`

- Create a new keycloak instance
  There is two ways to create a new key cloak instance:

  - The first by passing a URL that points to the location of our desired client configuration json
the json configuration itself can be found in keycloak itself by selecting the desired **realm**, then select **clients** then select the target client,
then from the action menu select **Download adapter config** it will show a json that you can copy and put in a file that can be loaded from your application server,
once you are ready you can create the keycloak instance as in the following example:

```java
Keycloak KEYCLOAK = Keycloak.create(Keycloak.KeycloakConfigUnionType.of([The url to load the json configuration file]));

```
      
  - The second way is by passing a new configuration instance and let keycloak know how to load the json configuration, in this case you need to setup the Keycloak config with the keycloak server url, the realm Id and the client Id, 
and keycloak will figure out how to load the json configuration from keycloak server instance :

```java
KeycloakConfig config = KeycloakConfig.create([Keycloak server url], [relam Id], [Client Id]);
Keycloak KEYCLOAK = Keycloak.create(Keycloak.KeycloakConfigUnionType.of(config));
```

- Use the new created instance 
```java
KEYCLOAK.init(initOptions)
        .success(authenticated -> {
            if (authenticated) {
                console.info("User authenticated. :-)");
            } else {
                KEYCLOAK.login(KeycloakLoginOptions.create());
            }
        })
        .error(error -> {
            console.error("Failed to init keycloak.!");
        });
```
