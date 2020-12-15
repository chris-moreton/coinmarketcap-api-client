package com.netsensia.crypto.client.coinmarketcap.model.cryptocurrency

data class CryptocurrencyDetails(
        val id: Int,
        val name: String,
        val symbol: String,
        val slug: String,
        val isActive: Int,
        val isFiat: Int,
        val circulatingSupply: Double,
        val maxSupply: Double,
        val totalSupply: Double,
        val dateAdded: String,
        val numMarketPairs: Int,
        val cmcRank: Int,
        val lastUpdated: String,
        val tags: List<String>,
        val platform: CryptocurrencyPlatform?,
        val quote: CryptocurrencyQuote
)
