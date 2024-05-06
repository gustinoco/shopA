package br.com.shop.shopA.providers

import br.com.shop.cart.commons.CartAnalyticsConstants
import br.com.shop.commons.ShopNetwork
import br.com.shop.login.AnalyticsConstants
import br.com.shop.login.repository.LoginResponse
import br.com.shop.shopping.commons.ShoppingAnalyticsConstants
import br.com.shop.shopping.repository.ShoppingResponse
import com.google.gson.Gson
import kotlinx.coroutines.delay
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

object ShopNetworkBuilder : ShopNetwork {

    private val BASE_URL = "http://localhost:8090/v1/"
    private val okHttpBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
    private var retrofit: Retrofit
    init {
        val client = okHttpBuilder.build()
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL).client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }


    override suspend fun getNetwork(url: String, responseClass: Any): Any {
            val response = Any()
//    val call = retrofit.create(GetService::class.java).getApi(url)
//        call?.enqueue(object : Callback<Any> {
//            override fun onResponse(call: Call<Any>, response: Response<Any>) {
//                if (response.isSuccessful) {
//                    val post = response.body()
//                    // Handle the retrieved post data
//                } else {
//                    // Handle error
//                }
//            }
//
//            override fun onFailure(call: Call<Any>, t: Throwable) {
//                // Handle failure
//            }
//        })
        return response
    }

    override suspend fun postNetwork(url: String, params: Any, responseClass: Any): Any {
        when (url) {
            AnalyticsConstants.urlEndpointHome -> {
                return LoginResponse("123", "421", "412")
            }

            CartAnalyticsConstants.urlEndpointShopping -> {
                val jsonString = "Sucesso"
                val gson = Gson()
                delay(2000)
                return gson.fromJson(jsonString, String::class.java)
            }

            ShoppingAnalyticsConstants.urlEndpointShopping -> {
                val jsonShopping = "{\n" +
                        "    \"data\": [\n" +
                        "        {\n" +
                        "            \"idProduct\": \"1234\",\n" +
                        "            \"value\": \"R\$ 500,00\",\n" +
                        "            \"description\": \"Teste cama\",\n" +
                        "            \"stock\": \"100\"\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"idProduct\": \"1234\",\n" +
                        "            \"value\": \"R\$ 500,00\",\n" +
                        "            \"description\": \"Teste cama\",\n" +
                        "            \"stock\": \"100\"\n" +
                        "        }\n" +
                        "    ]\n" +
                        "}"
                val gson = Gson()
                delay(2000)
                return gson.fromJson(jsonShopping, ShoppingResponse::class.java)
            }
        }

        return Any()
    }

    interface GetService {
        @GET
        fun getApi(@Url url: String?): Call<Any?>?
    }
}