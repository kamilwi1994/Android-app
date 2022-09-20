package com.example.vetplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dogBtn = findViewById<ImageButton>(R.id.dogBtn)
        dogBtn.setOnClickListener {

            val intent = Intent(this, wagaActivity::class.java)
            intent.putExtra("Rodzaj", "Pies")
            startActivity(intent)

        }
        val catBtn = findViewById<ImageButton>(R.id.catBtn)
        catBtn.setOnClickListener {

            val intent = Intent(this, wagaActivity::class.java)
            intent.putExtra("Rodzaj", "Kot")
            startActivity(intent)

        }
    }


}

