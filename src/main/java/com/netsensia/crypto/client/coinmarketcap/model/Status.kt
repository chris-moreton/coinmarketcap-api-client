package com.netsensia.crypto.client.coinmarketcap.model

data class Status(
        val timestamp: String,
        val errorCode: Int,
        val errorMessage: String?,
        val elapsed: Int,
        val creditCount: Int,
        val notice: String?
)
