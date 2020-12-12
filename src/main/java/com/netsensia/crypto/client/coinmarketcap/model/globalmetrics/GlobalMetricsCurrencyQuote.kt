package com.netsensia.crypto.client.coinmarketcap.model.globalmetrics

import java.time.ZonedDateTime

data class GlobalMetricsCurrencyQuote(
        val totalMarketCap: Double,
        val totalVolume24H: Double,
        val totalVolume24HReported: Double,
        val altcoinVolume24H: Double,
        val altcoinVolume24HReported: Double,
        val altcoinMarketCap: Double,
        val lastUpdated: String
)
