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
public interface InitOptions {

  @JsOverlay
  static InitOptions create() {
    InitOptions initOptions = Js.uncheckedCast(JsPropertyMap.of());
    initOptions.setUseNonce(true);
    initOptions.setOnLoad(KeycloakOnLoadAction.LOGIN_REQUIRED);
    initOptions.setCheckLoginIframeInterval(5);
    initOptions.setResponseMode(KeycloakResponseMode.FRAGMENT);
    initOptions.setEnableLogging(false);
    return initOptions;
  }

  @JsProperty
  boolean isUseNonce();

  @JsProperty
  void setUseNonce(boolean useNonce);

  @JsProperty
  String getOnLoad();

  @JsProperty
  void setOnLoad(String onLoad);

  @JsProperty
  String getSilentCheckSsoRedirectUri();

  @JsProperty
  void setSilentCheckSsoRedirectUri(String silentCheckSsoRedirectUri);

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
  String getResponseMode();

  @JsProperty
  void setResponseMode(String responseMode);

  @JsProperty
  String getFlow();

  @JsProperty
  void setFlow(String flow);

  @JsProperty
  boolean isEnableLogging();

  @JsProperty
  void setEnableLogging(boolean enableLogging);

  @JsProperty
  String getPkceMethod();

  @JsProperty
  void setPkceMethod(String pkceMethod);

  @JsProperty
  String getPromiseType();

  @JsProperty
  void setPromiseType(String promiseType);
}
