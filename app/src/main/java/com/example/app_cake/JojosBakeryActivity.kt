package com.example.app_cake

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class JojosBakeryActivity : AppCompatActivity() {

    lateinit var wbv_jojo: WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jojos_bakery)

        wbv_jojo = findViewById(R.id.jojoweb)
        val webSettings = wbv_jojo.settings
        webSettings.javaScriptEnabled = true
        wbv_jojo.loadUrl("https://www.jojosbakerytx.com/")


    }
}