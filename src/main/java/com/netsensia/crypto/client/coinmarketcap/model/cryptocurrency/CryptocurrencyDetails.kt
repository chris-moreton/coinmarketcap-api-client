package com.netsensia.crypto.client.coinmarketcap.model.cryptocurrency

data class CryptocurrencyDetails(
        val id: Int,
        val name: String,
        val symbol: String,
        val slug: String,
        val isActive: Int,
        val isFiat: Int,
        val circulatingSupply: Int,
        val totalSupply: Int,
        val dateAdded: String,
        val numMarketPairs: Int,
        val cmcRank: Int,
        val lastUpdated: String,
        val tags: List<String>,
        val platform: String?,
        val quote: CryptocurrencyQuote

)
