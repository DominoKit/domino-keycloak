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

import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class KeycloakPromise<Success, Error> extends Promise<Success> {

  public KeycloakPromise(PromiseExecutorCallbackFn<Success> executor) {
    super(executor);
  }

  public native KeycloakPromise<Success, Error> success(KeycloakPromiseCallback<Success> callback);

  public native KeycloakPromise<Success, Error> error(KeycloakPromiseCallback<Error> callback);
}
