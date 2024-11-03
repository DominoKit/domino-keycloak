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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface KeycloakInitOptions {

  @JsOverlay
  static KeycloakInitOptions create() {
    KeycloakInitOptions keycloakInitOptions = Js.uncheckedCast(JsPropertyMap.of());
    keycloakInitOptions.setUseNonce(true);
    keycloakInitOptions.setOnLoad(KeycloakOnLoadUnionType.login_required());
    keycloakInitOptions.setCheckLoginIframeInterval(5);
    keycloakInitOptions.setResponseMode(KeycloakResponseModeUnionType.fragment());
    keycloakInitOptions.setEnableLogging(false);
    return keycloakInitOptions;
  }

  @JsProperty
  boolean isUseNonce();

  @JsProperty
  void setUseNonce(boolean useNonce);

  @JsProperty
  KeycloakAdapterUnionType getAdapter();

  @JsProperty
  void setAdapter(KeycloakAdapterUnionType adapter);

  @JsProperty
  KeycloakOnLoadUnionType getOnLoad();

  /** @param onLoad Use a constant from {@link KeycloakOnLoadUnionType} */
  @JsProperty
  void setOnLoad(KeycloakOnLoadUnionType onLoad);

  @JsProperty
  String getToken();

  @JsProperty
  void setToken(String token);

  @JsProperty
  String getRefreshToken();

  @JsProperty
  void setRefreshToken(String refreshToken);

  @JsProperty
  String getIdToken();

  @JsProperty
  void setIdToken(String idToken);

  @JsProperty
  double getTimeSkew();

  @JsProperty
  void setTimeSkew(double timeSkew);

  @JsProperty
  boolean isCheckLoginIframe();

  @JsProperty
  void setCheckLoginIframe(boolean checkLoginIframe);

  @JsProperty
  double getCheckLoginIframeInterval();

  @JsProperty
  void setCheckLoginIframeInterval(double checkLoginIframeInterval);

  @JsProperty
  KeycloakResponseModeUnionType getResponseMode();

  /** @param responseMode use a constant from {@link KeycloakResponseModeUnionType} */
  @JsProperty
  void setResponseMode(KeycloakResponseModeUnionType responseMode);

  @JsProperty
  String getRedirectUri();

  @JsProperty
  void setRedirectUri(String redirectUri);

  @JsProperty
  String getSilentCheckSsoRedirectUri();

  @JsProperty
  void setSilentCheckSsoRedirectUri(String silentCheckSsoRedirectUri);

  @JsProperty
  KeycloakFlowUnionType getFlow();

  /** @param flow use a constant from {@link KeycloakFlowUnionType} */
  @JsProperty
  void setFlow(KeycloakFlowUnionType flow);

  @JsProperty
  KeycloakPkcsMethodUnionType getPkceMethod();

  /** @param pkceMethod use a constant from {@link KeycloakPkceMethod} */
  @JsProperty
  void setPkceMethod(KeycloakPkcsMethodUnionType pkceMethod);

  @JsProperty
  boolean isEnableLogging();

  @JsProperty
  void setEnableLogging(boolean enableLogging);

  @JsProperty
  String getScope();

  @JsProperty
  void setScope(String scope);

  @JsProperty
  double getMessageReceiveTimeout();

  @JsProperty
  void setMessageReceiveTimeout(double messageReceiveTimeout);

  @JsProperty
  String getLocale();

  @JsProperty
  void setLocale(String locale);

  @JsProperty
  KeycloakLogoutMethodUnionType getLogoutMethod();

  @JsProperty
  void setLogoutMethod(KeycloakLogoutMethodUnionType logoutMethod);
}
