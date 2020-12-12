package com.netsensia.crypto.client.coinmarketcap.model.globalmetrics

import java.time.ZonedDateTime

data class GlobalMetricsStatus(
        val timestamp: String,
        val errorCode: Int,
        val errorMessage: String?,
        val elapsed: Int,
        val creditCount: Int,
        val notice: String?
)
