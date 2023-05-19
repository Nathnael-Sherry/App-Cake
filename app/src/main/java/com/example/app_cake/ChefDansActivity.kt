package com.example.app_cake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ChefDansActivity : AppCompatActivity() {

    lateinit var wbv_chefdan: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chef_dans)

        wbv_chefdan = findViewById(R.id.chefweb)
        val webSettings = wbv_chefdan.settings
        webSettings.javaScriptEnabled = true
        wbv_chefdan.loadUrl("https://lavidavanilla.com/product/chef-dans-strawberry-vanilla-pound-cake/")

    }
}