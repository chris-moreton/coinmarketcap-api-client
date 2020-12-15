package com.netsensia.crypto.client.coinmarketcap.model.cryptocurrency

data class CryptocurrencyPlatform (
    val id: Int,
    val name: String,
    val symbol: String,
    val slug: String,
    val tokenAddress: String
)