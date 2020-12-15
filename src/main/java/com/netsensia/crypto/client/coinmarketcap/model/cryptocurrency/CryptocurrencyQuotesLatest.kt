package com.netsensia.crypto.client.coinmarketcap.model.cryptocurrency

import com.netsensia.crypto.client.coinmarketcap.model.Status

data class CryptocurrencyQuotesLatest(
        val status: Status,
        val data: CryptocurrencyData,
)