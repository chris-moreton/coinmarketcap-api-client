package com.netsensia.crypto.client.coinmarketcap.model.cryptocurrency

import com.google.gson.annotations.SerializedName

data class CryptocurrencyData(
        @SerializedName("BTC")
        val btc: CryptocurrencyDetails,

        @SerializedName("ETH")
        val eth: CryptocurrencyDetails,

        @SerializedName("XRP")
        val xrp: CryptocurrencyDetails,

        @SerializedName("USDT")
        val usdt: CryptocurrencyDetails,

        @SerializedName("BCH")
        val bch: CryptocurrencyDetails,

        @SerializedName("LTC")
        val ltc: CryptocurrencyDetails,

        @SerializedName("LINK")
        val link: CryptocurrencyDetails,

        @SerializedName("ADA")
        val ada: CryptocurrencyDetails,

        @SerializedName("DOT")
        val dot: CryptocurrencyDetails,

        @SerializedName("BNB")
        val bnb: CryptocurrencyDetails,

        @SerializedName("XMR")
        val xmr: CryptocurrencyDetails,

        @SerializedName("PIVX")
        val pivx: CryptocurrencyDetails,

        @SerializedName("SOL")
        val sol: CryptocurrencyDetails,
)
