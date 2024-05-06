package br.com.shop.shopA.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.shop.commons.ShopRoutes
import br.com.shop.shopA.providers.ShopNavigateBuilder
import java.lang.Thread.sleep

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sleep(2000)
        ShopNavigateBuilder.navigate(this, ShopRoutes.Login.route)
        finish()
    }
}