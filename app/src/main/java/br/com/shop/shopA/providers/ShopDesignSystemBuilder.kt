package br.com.shop.shopA.providers

import br.com.shop.commons.ShopDesignSystem

object ShopDesignSystemBuilder : ShopDesignSystem {
    override fun primaryColor(): Int {
        return 0
    }

    override fun secondaryColor(): Int {
        return 1
    }
}