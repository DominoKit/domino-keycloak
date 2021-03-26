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
- Make sure the `keycloak.js` adapter is loaded in your html page.

- Create a new keycloak instance 

```java
KEYCLOAK = Keycloak.create([url to load the keycloak config json file or a json string]);
```

- Use the new created instance 

```java
keycloakInstance().onReady = (authenticated -> {
    if (authenticated) {
        // Authenticated user
    } else {
        KEYCLOAK.login(LoginOptions.create());
    }
});
```

