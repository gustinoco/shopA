package br.com.shop.shopA.providers.impl

import br.com.shop.cart.CartModuleCallback
import br.com.shop.cart.repository.CartResponse
import com.google.gson.Gson
import kotlinx.coroutines.delay

object CartCallbackImpl: CartModuleCallback {
    override suspend fun getCartsFromCacheOrUrl(key: String): CartResponse {
        val jsonString = "{\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"idProduct\": \"1234\",\n" +
                "            \"value\": \"R\$ 500,00\",\n" +
                "            \"valuePast\": \"R\$ 500,00\",\n" +
                "            \"description\": \"Teste cama\",\n" +
                "            \"stockPast\": \"100\", \n" +
                "            \"stock\": \"100\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"idProduct\": \"1234\",\n" +
                "            \"value\": \"R\$ 500,00\",\n" +
                "            \"valuePast\": \"R\$ 400,00\",\n" +
                "            \"description\": \"Teste cama\",\n" +
                "            \"stockPast\": \"90\", \n" +
                "            \"stock\": \"500\"\n" +
                "        }\n" +
                "    ]\n" +
                "}"

        val gson = Gson()
        delay(2000)
        return gson.fromJson(jsonString, CartResponse::class.java)
    }
}