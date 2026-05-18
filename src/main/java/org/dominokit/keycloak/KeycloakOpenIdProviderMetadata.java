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
public interface KeycloakOpenIdProviderMetadata {

  @JsOverlay
  static KeycloakOpenIdProviderMetadata create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsProperty(name = "authorization_endpoint")
  String getAuthorizationEndpoint();

  @JsProperty(name = "authorization_endpoint")
  void setAuthorizationEndpoint(String authorizationEndpoint);

  @JsProperty(name = "token_endpoint")
  String getTokenEndpoint();

  @JsProperty(name = "token_endpoint")
  void setTokenEndpoint(String tokenEndpoint);

  @JsProperty(name = "userinfo_endpoint")
  String getUserinfoEndpoint();

  @JsProperty(name = "userinfo_endpoint")
  void setUserinfoEndpoint(String userinfoEndpoint);

  @JsProperty(name = "check_session_iframe")
  String getCheckSessionIframe();

  @JsProperty(name = "check_session_iframe")
  void setCheckSessionIframe(String checkSessionIframe);

  @JsProperty(name = "end_session_endpoint")
  String getEndSessionEndpoint();

  @JsProperty(name = "end_session_endpoint")
  void setEndSessionEndpoint(String endSessionEndpoint);
}
