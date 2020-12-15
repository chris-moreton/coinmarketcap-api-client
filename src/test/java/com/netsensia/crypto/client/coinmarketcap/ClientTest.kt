package com.netsensia.crypto.client.coinmarketcap

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ClientTest {

    @Test
    fun testGlobalMetrics() {
        val result = Client.globalMetrics()
        assertTrue(result.data.activeCryptocurrencies > 100)
    }

    @Test
    fun testLatestQuotes() {
        val result = Client.quotes()
        assertEquals("bitcoin", result.data.btc.name)
    }
}