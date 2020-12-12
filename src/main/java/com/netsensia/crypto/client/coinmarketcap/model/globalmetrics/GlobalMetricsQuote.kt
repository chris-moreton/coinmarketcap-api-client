package com.netsensia.crypto.client.coinmarketcap.model.globalmetrics

import com.google.gson.annotations.SerializedName

data class GlobalMetricsQuote (
    @SerializedName("USD")
    val usd: GlobalMetricsCurrencyQuote
)
