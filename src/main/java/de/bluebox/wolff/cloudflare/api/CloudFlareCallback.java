package de.bluebox.wolff.cloudflare.api;

import java.util.Map;

public interface CloudFlareCallback<V> {
  void onSuccess(V value);

  void onFailure(Throwable t, int statusCode, String statusMessage, Map<Integer, String> errors);
}
