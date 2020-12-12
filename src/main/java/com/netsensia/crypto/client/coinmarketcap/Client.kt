package com.netsensia.crypto.client.coinmarketcap

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

    @JvmStatic
    fun main(args: Array<String>) {
        val uri = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest"
        val paratmers: MutableList<NameValuePair> = ArrayList<NameValuePair>()
        paratmers.add(BasicNameValuePair("start", "1"))
        paratmers.add(BasicNameValuePair("limit", "5000"))
        paratmers.add(BasicNameValuePair("convert", "USD"))
        try {
            val result = makeAPICall(uri, paratmers)
            println(result)
        } catch (e: IOException) {
            println("Error: cannont access content - $e")
        } catch (e: URISyntaxException) {
            println("Error: Invalid URL $e")
        }
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
            System.out.println(response.getStatusLine())
            val entity: HttpEntity = response.getEntity()
            response_content = EntityUtils.toString(entity)
            EntityUtils.consume(entity)
        } finally {
            response.close()
        }
        return response_content
    }
}