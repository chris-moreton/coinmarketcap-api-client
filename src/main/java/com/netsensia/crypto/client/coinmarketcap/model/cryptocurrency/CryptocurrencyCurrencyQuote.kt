package com.netsensia.crypto.client.coinmarketcap.model.cryptocurrency

data class CryptocurrencyCurrencyQuote(
        val price: Double,
        val volume24h: Double,
        val percentChange1h: Double,
        val percentChange24h: Double,
        val percentChange7d: Double,
        val marketCap: Double,
        val lastUpdated: String
)
