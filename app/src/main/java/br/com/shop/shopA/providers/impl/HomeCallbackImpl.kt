package br.com.shop.shopA.providers.impl

import br.com.shop.home.HomeCallback

object HomeCallbackImpl : HomeCallback {
    var cachedTest: Boolean = true
    override fun hasCacheCart(): Boolean {
        return cachedTest
    }
}