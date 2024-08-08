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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface KeycloakLoginOptions {

  @JsOverlay
  public static KeycloakLoginOptions create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsOverlay
  static KeycloakLoginOptions createRegisterOptions() {
    KeycloakLoginOptions keycloakLoginOptions = Js.uncheckedCast(JsPropertyMap.of());
    keycloakLoginOptions.setAction("register");
    return keycloakLoginOptions;
  }

  @JsProperty
  String getScope();

  @JsProperty
  void setScope(String scope);

  @JsProperty
  String getRedirectUri();

  @JsProperty
  void setRedirectUri(String redirectUri);

  @JsProperty
  KeycloakPromptUnionType getPrompt();

  /** @param prompt use a constant from {@link KeycloakPromptUnionType} */
  @JsProperty
  void setPrompt(KeycloakPromptUnionType prompt);

  @JsProperty
  String getAction();

  @JsProperty
  void setAction(String action);

  @JsProperty
  double getMaxAge();

  @JsProperty
  void setMaxAge(double maxAge);

  @JsProperty
  String getLoginHint();

  @JsProperty
  void setLoginHint(String loginHint);

  @JsProperty
  Acr getAcr();

  @JsProperty
  void setAcr(Acr acr);

  @JsProperty
  String getIdpHint();

  @JsProperty
  void setIdpHint(String idpHint);

  @JsProperty
  String getLocale();

  @JsProperty
  void setLocale(String locale);

  @JsProperty
  JsObject getCordovaOptions();

  @JsProperty
  void setCordovaOptions(JsObject cordovaOptions);
}
