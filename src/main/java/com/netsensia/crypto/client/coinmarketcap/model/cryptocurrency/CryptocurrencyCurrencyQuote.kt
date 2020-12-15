package com.netsensia.crypto.client.coinmarketcap.model.cryptocurrency

import com.google.gson.annotations.SerializedName

data class CryptocurrencyCurrencyQuote(
        val price: Double,

        @SerializedName("volume_24h")
        val volume24h: Double,

        @SerializedName("percent_change_1h")
        val percentChange1h: Double,

        @SerializedName("percent_change_24h")
        val percentChange24h: Double,

        @SerializedName("percent_change_7d")
        val percentChange7d: Double,

        val marketCap: Double,
        val lastUpdated: String
)
