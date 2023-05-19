package com.example.app_cake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ArtcafeActivity : AppCompatActivity() {

    lateinit var wbv_artcafe:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artcafe)

        wbv_artcafe = findViewById(R.id.artcafeweb)
        val webSettings = wbv_artcafe.settings
        webSettings.javaScriptEnabled = true
        wbv_artcafe.loadUrl("https://www.artcaffemarket.co.ke/market/bakery/")


    }
}