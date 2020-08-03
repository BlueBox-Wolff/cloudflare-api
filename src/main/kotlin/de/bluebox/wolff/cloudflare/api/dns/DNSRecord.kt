package de.bluebox.wolff.cloudflare.api.dns

import com.google.gson.JsonObject

data class DNSRecord(
  private val type: String,
  private val name: String,
  private val content: String,
  private val ttl: Int = 1,
  private val proxied: Boolean = false,
  private val data: JsonObject
)
