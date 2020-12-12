package com.netsensia.crypto.client.coinmarketcap.model.globalmetrics

import java.time.ZonedDateTime

data class GlobalMetricsData(
        val activeCryptocurrencies: Int,
        val totalCryptocurrencies: Int,
        val activeMarketPairs: Int,
        val activeExchanges: Int,
        val totalExchanges: Int,
        val ethDominance: Double,
        val btcDominance: Double,
        val defiVolume24H: Double,
        val defiVolume24HReported: Double,
        val defiMarketCap: Double,
        val defi24HPercentageChange: Double,
        val stablecoinVolume24H: Double,
        val stablecoinVolume24HReported: Double,
        val stablecoinMarketCap: Double,
        val stablecoin24HPercentageChange: Double,
        val derivativesVolume24H: Double,
        val derivativesVolume24HReported: Double,
        val derivatives24HPercentageChange: Double,
        val quote: GlobalMetricsQuote,
        val lastUpdated: String
)
