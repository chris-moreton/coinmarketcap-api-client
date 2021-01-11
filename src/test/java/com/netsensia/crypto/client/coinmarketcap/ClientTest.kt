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
        assertEquals("Bitcoin", result.data.btc.name)
        assertEquals("Ethereum", result.data.eth.name)
        assertEquals("Cardano", result.data.ada.name)
        assertEquals("Tether", result.data.usdt.name)
        assertEquals("Bitcoin Cash", result.data.bch.name)
        assertEquals("XRP", result.data.xrp.name)
        assertEquals("Chainlink", result.data.link.name)
        assertEquals("Polkadot", result.data.dot.name)
        assertEquals("Binance Coin", result.data.bnb.name)
        assertEquals("Litecoin", result.data.ltc.name)
        assertEquals("Solana", result.data.sol.name)
        assertEquals("Zilliqa", result.data.zil.name)

        assertTrue(result.data.ada.quote.usd.percentChange1h != 0.0)

    }
}