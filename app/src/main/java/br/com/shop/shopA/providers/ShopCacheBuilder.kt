package br.com.shop.shopA.providers

import br.com.shop.commons.ShopCache
import br.com.shop.shopA.providers.impl.HomeCallbackImpl.cachedTest

object ShopCacheBuilder : ShopCache {
    override fun deleteCache(key: String) {
        cachedTest = false
    }

    override fun getCache(key: String, cacheClass: Any): Any {
        return Any()
    }

    override fun putCache(key: String, data: Any) {
        cachedTest = true
    }
}

