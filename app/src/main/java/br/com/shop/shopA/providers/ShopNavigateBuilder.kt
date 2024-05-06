package br.com.shop.shopA.providers

import android.content.Context
import br.com.shop.cart.CartLoginInitializer
import br.com.shop.cart.CartModuleDependencies
import br.com.shop.commons.ShopNavigate
import br.com.shop.commons.ShopRoutes
import br.com.shop.home.HomeLoginInitializer
import br.com.shop.home.HomeModuleDependencies
import br.com.shop.login.LoginModuleDependencies
import br.com.shop.login.ShoploginInitializer
import br.com.shop.shopA.providers.impl.CartCallbackImpl
import br.com.shop.shopA.providers.impl.HomeCallbackImpl
import br.com.shop.shopping.ShoppingLoginInitializer
import br.com.shop.shopping.ShoppingModuleDependencies
import java.io.Serializable

object ShopNavigateBuilder : ShopNavigate {

    override fun navigate(context: Context, route: String, params: HashMap<String, Serializable>) {

        when (route) {
            ShopRoutes.Login.route -> {
                ShoploginInitializer.Builder()
                    .setContext(context)
                    .setTheme(0)
                    .setLoginModuleDependencies(
                        LoginModuleDependencies(
                            ShopNetworkBuilder,
                            ShopAnalyticsBuilder,
                            ShopDesignSystemBuilder,
                            ShopNavigateBuilder,
                            ShopCacheBuilder
                        )
                    )
                    .build()
            }

            ShopRoutes.Home.route -> {
                HomeLoginInitializer.Builder()
                    .setContext(context)
                    .setTheme(0)
                    .setHomeCallback(HomeCallbackImpl)
                    .setLoginModuleDependencies(
                        HomeModuleDependencies(
                            ShopNetworkBuilder,
                            ShopAnalyticsBuilder,
                            ShopDesignSystemBuilder,
                            ShopNavigateBuilder,
                            ShopCacheBuilder
                        )
                    )
                    .build()
            }

            ShopRoutes.Cart.route -> {
                CartLoginInitializer.Builder()
                    .setContext(context)
                    .setTheme(0)
                    .setKeyCart("1234_cart")
                    .setCallback(CartCallbackImpl)
                    .setLoginModuleDependencies(
                        CartModuleDependencies(
                            ShopNetworkBuilder,
                            ShopAnalyticsBuilder,
                            ShopDesignSystemBuilder,
                            ShopNavigateBuilder,
                            ShopCacheBuilder
                        )
                    )
                    .build()
            }

            ShopRoutes.Shopping.route -> {
                ShoppingLoginInitializer.Builder()
                    .setContext(context)
                    .setTheme(0)
                    .setKeyCart("1234_cart")
                    .setLoginModuleDependencies(
                        ShoppingModuleDependencies(
                            ShopNetworkBuilder,
                            ShopAnalyticsBuilder,
                            ShopDesignSystemBuilder,
                            ShopNavigateBuilder,
                            ShopCacheBuilder
                        )
                    )
                    .build()
            }
        }
    }
}

