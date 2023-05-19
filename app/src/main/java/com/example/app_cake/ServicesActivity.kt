package com.example.app_cake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ServicesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        val exit = findViewById<CardView>(R.id.cardfdback)
        exit.setOnClickListener {
            startActivity(
                Intent(this@ServicesActivity, MainActivity::class.java )
            )
        }

        val wincer_card = findViewById<CardView>(R.id.crd_wincer)
        wincer_card.setOnClickListener {
            val it = Intent(this, WincerBakeriasActivity::class.java)
            it.putExtra("title", "Family Bakers")
            startActivity(it)
        }

        val jojo_card = findViewById<CardView>(R.id.crd_jojo)
        jojo_card.setOnClickListener {
            val it = Intent(this, JojosBakeryActivity::class.java)
            it.putExtra("title", "Dietery bakes")
            startActivity(it)
        }

        val artcafe_card = findViewById<CardView>(R.id.crd_artcafe)
        artcafe_card.setOnClickListener {
            val it = Intent(this, ArtcafeActivity::class.java)
            it.putExtra("title", "Catenery")
            startActivity(it)
        }

        val naivas_card = findViewById<CardView>(R.id.crdnaivas)
        naivas_card.setOnClickListener {
            val it = Intent(this,NaivasActivity::class.java)
            it.putExtra("title", "sugarbased")
            startActivity(it)
        }

        val dan_card = findViewById<CardView>(R.id.crdDan)
        dan_card.setOnClickListener {
            val it = Intent(this, ChefDansActivity::class.java)
            startActivity(it)
        }


    }
}