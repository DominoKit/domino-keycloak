package org.dominokit.keycloak;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface EventCallback {
  void invoke();
}