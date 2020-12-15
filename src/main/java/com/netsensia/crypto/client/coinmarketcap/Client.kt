package com.netsensia.crypto.client.coinmarketcap

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.netsensia.crypto.client.coinmarketcap.model.cryptocurrency.CryptocurrencyQuotesLatest
import com.netsensia.crypto.client.coinmarketcap.model.globalmetrics.GlobalMetricsQuotesLatest
import org.apache.http.HttpEntity
import org.apache.http.HttpHeaders
import org.apache.http.NameValuePair
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.utils.URIBuilder
import org.apache.http.impl.client.CloseableHttpClient
import org.apache.http.impl.client.HttpClients
import org.apache.http.message.BasicNameValuePair
import org.apache.http.util.EntityUtils
import java.io.IOException
import java.net.URISyntaxException
import java.util.*

object Client {
    private val apiKey = System.getenv("COINMARKETCAP_API_KEY")
    private val gson = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()

    @JvmStatic
    fun globalMetrics(): GlobalMetricsQuotesLatest {
        val uri = "https://pro-api.coinmarketcap.com/v1/global-metrics/quotes/latest"
        val parameters: MutableList<NameValuePair> = ArrayList<NameValuePair>()
        val result = makeAPICall(uri, parameters)
        val resultObject = gson.fromJson(result, GlobalMetricsQuotesLatest::class.java)
        return resultObject
    }

    @JvmStatic
    fun quotes(): CryptocurrencyQuotesLatest {
        val uri = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest"
        val parameters: MutableList<NameValuePair> = ArrayList<NameValuePair>()
        parameters.add(BasicNameValuePair("symbol", "BTC,ETH,XRP,USDT,BCH,LTC,LINK,ADA,DOT,BNB"))
        val result = makeAPICall(uri, parameters)
        val resultObject = gson.fromJson(result, CryptocurrencyQuotesLatest::class.java)
        return resultObject
    }

    @Throws(URISyntaxException::class, IOException::class)
    fun makeAPICall(uri: String?, parameters: List<NameValuePair>?): String {
        var response_content = ""
        val query = URIBuilder(uri)
        query.addParameters(parameters)
        val client: CloseableHttpClient = HttpClients.createDefault()
        val request = HttpGet(query.build())
        request.setHeader(HttpHeaders.ACCEPT, "application/json")
        request.addHeader("X-CMC_PRO_API_KEY", apiKey)
        val response: CloseableHttpResponse = client.execute(request)
        try {
            val entity: HttpEntity = response.getEntity()
            response_content = EntityUtils.toString(entity)
            EntityUtils.consume(entity)
        } finally {
            response.close()
        }
        return response_content
    }
}