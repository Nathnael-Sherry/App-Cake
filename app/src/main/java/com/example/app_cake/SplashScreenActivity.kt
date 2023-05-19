package com.example.app_cake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        supportActionBar?.hide()

        Handler().postDelayed({
            var gotoone = Intent(this, LoginActivity::class.java)
            startActivity(gotoone)
        },3000)

    }
}