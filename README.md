![logoimage](https://raw.githubusercontent.com/DominoKit/DominoKit.github.io/master/logo/128.png)

<a title="Gitter" href="https://gitter.im/DominoKit/domino"><img src="https://badges.gitter.im/Join%20Chat.svg"></a>
[![Development Build Status](https://github.com/DominoKit/domino-keycloak/actions/workflows/deploy.yaml/badge.svg?branch=development)](https://github.com/DominoKit/domino-keycloak/actions/workflows/deploy.yaml/badge.svg?branch=development)
![Maven Central](https://img.shields.io/badge/Release-1.0.0-green)
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
    <version>1.0.0</version>
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

- Create a new keycloak instance 

```java
KEYCLOAK = Keycloak.create([url to load the keycloak config json file or a json string]);
```

- Use the new created instance 

```java
KEYCLOAK.onReady = (authenticated -> {
    if (authenticated) {
        // Authenticated user
    } else {
        KEYCLOAK.login(LoginOptions.create());
    }
});
```

