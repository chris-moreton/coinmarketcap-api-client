package com.netsensia.crypto.client.coinmarketcap.model.cryptocurrency

import com.google.gson.annotations.SerializedName

data class CryptocurrencyQuote(
        @SerializedName("USD")
        val usd: CryptocurrencyCurrencyQuote
)
