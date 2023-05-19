package com.example.app_cake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WincerBakeriasActivity : AppCompatActivity() {

    lateinit var wbv_wincer: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wincer_bakerias)

        wbv_wincer = findViewById(R.id.wincer)
        val webSettings = wbv_wincer.settings
        webSettings.javaScriptEnabled = true
        wbv_wincer.loadUrl("https://www.bakerias.com/KE/Nairobi/349108229186707/Wincer-Cake-House")


    }
}