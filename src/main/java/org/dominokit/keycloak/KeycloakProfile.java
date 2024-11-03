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
import jsinterop.annotations.JsProperty;

public interface KeycloakProfile {

  @JsProperty
  String getId();

  @JsProperty
  void setId(String id);

  @JsProperty
  String getUsername();

  @JsProperty
  void setUsername(String username);

  @JsProperty
  String getEmail();

  @JsProperty
  void setEmail(String email);

  @JsProperty
  String getFirstName();

  @JsProperty
  void setFirstName(String firstName);

  @JsProperty
  String getLastName();

  @JsProperty
  void setLastName(String lastName);

  @JsProperty
  boolean isEnabled();

  @JsProperty
  void setEnabled(boolean enabled);

  @JsProperty
  boolean isEmailVerified();

  @JsProperty
  void setEmailVerified(boolean emailVerified);

  @JsProperty
  boolean isTotp();

  @JsProperty
  void setTotp(boolean totp);

  @JsProperty
  double getCreatedTimestamp();

  @JsProperty
  void setCreatedTimestamp(double createdTimestamp);

  @JsProperty
  JsObject getAttributes();

  @JsProperty
  void setAttributes(JsObject attributes);
}
