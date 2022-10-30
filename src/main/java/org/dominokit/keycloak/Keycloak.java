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
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
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
  public String responseMode;
  public String responseType;
  public String flow;
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

  public String adapter;

  public native void onReady(boolean authenticated);

  public native void onAuthSuccess();

  public native void onAuthError(KeycloakError errorDate);

  public native void onAuthRefreshSuccess();

  public native void onAuthRefreshError();

  public native void onAuthLogout();

  public native void onTokenExpired();

  public native void onActionUpdate(String status);

  public native KeycloakPromise<Boolean, KeycloakError> init(KeycloakInitOptions initOptions);

  public native KeycloakPromise<Void, Void> login(KeycloakLoginOptions options);

  public native KeycloakPromise<Void, Void> login();

  public native KeycloakPromise<Void, Void> logout(KeycloakLogoutOptions options);

  public native KeycloakPromise<Void, Void> logout();

  public native KeycloakPromise<Void, Void> register(KeycloakRegisterOptions options);

  public native KeycloakPromise<Void, Void> register();

  public native KeycloakPromise<Void, Void> accountManagement();

  public native String createLoginUrl(KeycloakLoginOptions options);

  public native String createLogoutUrl(KeycloakLogoutOptions options);

  public native String createRegisterUrl(KeycloakRegisterOptions options);

  public native String createAccountUrl(KeycloakAccountOptions options);

  public native boolean isTokenExpired(double minValidity);

  public native KeycloakPromise<Boolean, Boolean> updateToken(double minValidity);

  public native void clearToken();

  public native boolean hasRealmRole(String role);

  public native boolean hasResourceRole(String role, String resource);

  public native KeycloakPromise<KeycloakProfile, Void> loadUserProfile();

  public native KeycloakPromise<JsObject, Void> loadUserInfo();
}
