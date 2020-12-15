package com.netsensia.crypto.client.coinmarketcap.model.globalmetrics

import com.netsensia.crypto.client.coinmarketcap.model.Status

data class GlobalMetricsQuotesLatest(
        val status: Status,
        val data: GlobalMetricsData,
)