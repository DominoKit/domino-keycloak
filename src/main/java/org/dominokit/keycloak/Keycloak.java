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

import elemental2.core.JsArray;
import elemental2.core.JsObject;
import elemental2.promise.Promise;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "keycloak")
public class Keycloak extends JsObject {

  @JsOverlay
  public static Keycloak getInstance() {
    return KeycloakDom.window.keycloak;
  }

  @JsOverlay
  public static Keycloak create(String configUrl) {
    Keycloak keycloak = KeycloakDom.window.Keycloak(configUrl);
    KeycloakDom.window.keycloak = keycloak;
    return KeycloakDom.window.keycloak;
  }

  public boolean authenticated;
  public String token;
  public JsObject parsedToken;
  public String subject;
  public String idToken;
  public JsObject idTokenParsed;
  public JsArray<String> realmAccess;
  public JsArray<String> resourceAccess;
  public String refreshToken;
  public JsObject refreshTokenParsed;
  public double timeSkew;
  public String responseMode;
  public String flow;
  public String adapter;
  public String responseType;

  public OnReadyListener onReady;
  public OnAuthErrorListener onAuthError;
  public OnAuthLogoutListener onAuthLogout;
  public OnAuthRefreshErrorListener onAuthRefreshError;
  public OnAuthRefreshSuccessListener onAuthRefreshSuccess;
  public OnAuthSuccessListener onAuthSuccess;
  public OnTokenExpiredListener onTokenExpired;

  public native Promise<Boolean> init(InitOptions initOptions);

  public native void login(LoginOptions loginOptions);

  public native String createLoginUrl(LoginOptions loginOptions);

  public native void logout(LogoutOptions logoutOptions);

  public native String createLogoutUrl(LogoutOptions logoutOptions);

  public native String register(LoginOptions loginOptions);

  public native String createRegisterUrl(LoginOptions loginOptions);

  public native void accountManagement();

  public native String createAccountUrl();

  public native boolean hasRealmRole(String role);

  public native boolean hasResourceRole(String role, String resource);

  public native Promise<JsObject> loadUserProfile();

  public native boolean isTokenExpired(double minValidity);

  public native Promise<Boolean> updateToken(double minValidity);

  public native void clearToken();
}
