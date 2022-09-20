package com.example.vetplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class bolActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bol)


        val intent = intent
        val waga = intent.getStringExtra("Waga")
        val rodzaj = intent.getStringExtra("Rodzaj")


        val middleBtn = findViewById<Button>(R.id.middleBtn)
        val highBtn = findViewById<Button>(R.id.highBtn)

        middleBtn.setOnClickListener {
            val intent = Intent(this, MediumActivity::class.java)

            intent.putExtra("Waga", waga)
            intent.putExtra("Rodzaj", rodzaj)
            intent.putExtra("Siła", "mid")
            startActivity(intent)


        }
        highBtn.setOnClickListener {
            val intent = Intent(this, MediumActivity::class.java)

            intent.putExtra("Waga", waga)
            intent.putExtra("Rodzaj", rodzaj)
            intent.putExtra("Siła", "high")
            startActivity(intent)


        }
        val menuBtn = findViewById<Button>(R.id.menuBtn)

        menuBtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
        }
    }
}