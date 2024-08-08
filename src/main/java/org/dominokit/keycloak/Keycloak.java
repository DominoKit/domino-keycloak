/*
 * Copyright © 2019 Dominokit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dominokit.keycloak;

import elemental2.core.JsObject;
import elemental2.promise.Promise;
import jsinterop.annotations.*;
import jsinterop.base.Js;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Keycloak")
public class Keycloak extends JsObject {

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface KeycloakConfigUnionType {
    @JsOverlay
    static Keycloak.KeycloakConfigUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default String asUrl() {
      return Js.asString(this);
    }

    @JsOverlay
    default KeycloakConfig asConfig() {
      return Js.cast(this);
    }
  }

  @JsConstructor
  public Keycloak(KeycloakConfigUnionType config) {}

  public boolean authenticated;
  public String subject;
  public KeycloakResponseModeUnionType responseMode;
  public KeycloakResponseTypeUnionType responseType;
  public KeycloakFlowUnionType flow;
  public KeycloakRoles realmAccess;
  public KeycloakResourceAccess resourceAccess;
  public String token;
  public KeycloakTokenParsed parsedToken;
  public String refreshToken;
  public KeycloakTokenParsed refreshTokenParsed;
  public String idToken;
  public KeycloakTokenParsed idTokenParsed;
  public double timeSkew;
  public boolean loginRequired;
  public String authServerUrl;
  public String realm;
  public String clientId;
  public String clientSecret;
  public String redirectUri;
  public String sessionId;
  public KeycloakProfile profile;
  public JsObject userInfo;

  public native EventCallback onActionUpdate(String status);

  public native Promise<Boolean> init(KeycloakInitOptions initOptions);

  public native Promise<Void> login(KeycloakLoginOptions options);

  public native Promise<Void> login();

  public native Promise<Void> logout(KeycloakLogoutOptions options);

  public native Promise<Void> logout();

  public native Promise<Void> register(KeycloakRegisterOptions options);

  public native Promise<Void> register();

  public native Promise<Void> accountManagement();

  public native String createLoginUrl(KeycloakLoginOptions options);

  public native String createLogoutUrl(KeycloakLogoutOptions options);

  public native String createRegisterUrl(KeycloakRegisterOptions options);

  public native String createAccountUrl(KeycloakAccountOptions options);

  public native boolean isTokenExpired(double minValidity);

  public native Promise<Boolean> updateToken(double minValidity);

  public native void clearToken();

  public native boolean hasRealmRole(String role);

  public native boolean hasResourceRole(String role, String resource);

  public native Promise<KeycloakProfile> loadUserProfile();

  public native Promise<JsObject> loadUserInfo();

  @JsProperty
  public native void setOnReady(OnReadyEventCallback onReady);

  @JsProperty
  public native void setOnAuthSuccess(EventCallback onAuthSuccess);

  @JsProperty
  public native void setOnAuthError(OnAuthErrorEventCallback onAuthError);

  @JsProperty
  public native void setOnAuthRefreshSuccess(EventCallback onAuthRefreshSuccess);

  @JsProperty
  public native void setOnAuthRefreshError(EventCallback onAuthRefreshError);

  @JsProperty
  public native void setOnAuthLogout(EventCallback onAuthLogout);

  @JsProperty
  public native void setOnTokenExpired(EventCallback onTokenExpired);
}
