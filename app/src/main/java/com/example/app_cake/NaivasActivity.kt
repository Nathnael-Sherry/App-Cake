package com.example.app_cake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class NaivasActivity : AppCompatActivity() {

    lateinit var Naiv_web:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naivas)

        Naiv_web = findViewById(R.id.naivWeb)
        val webSettings = Naiv_web.settings
        webSettings.javaScriptEnabled = true
        Naiv_web.loadUrl("https://naivas.online/naivas-bakery")

    }
}