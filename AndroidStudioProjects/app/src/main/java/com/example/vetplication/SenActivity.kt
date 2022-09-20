package com.example.vetplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sen)
        val intent = intent
        val waga = intent.getStringExtra("Waga")
        val rodzaj = intent.getStringExtra("Rodzaj")

        val premedBtn = findViewById<Button>(R.id.PremedBtn)

        premedBtn.setOnClickListener {
            val intent = Intent(this, SenProcActivity::class.java)

            intent.putExtra("Waga", waga)
            intent.putExtra("Rodzaj", rodzaj)
            intent.putExtra("Sen", "premed")
            startActivity(intent)


        }
        val indBtn = findViewById<Button>(R.id.IndBtn)
        indBtn.setOnClickListener {
            val intent = Intent(this, SenProcActivity::class.java)

            intent.putExtra("Waga", waga)
            intent.putExtra("Rodzaj", rodzaj)
            intent.putExtra("Sen", "ind")
            startActivity(intent)


        }
        val podtBtn = findViewById<Button>(R.id.PodtBtn)

        podtBtn.setOnClickListener {
            val intent = Intent(this, SenProcActivity::class.java)
            intent.putExtra("Waga", waga)
            intent.putExtra("Rodzaj", rodzaj)
            intent.putExtra("Sen", "podt")
            startActivity(intent)

        }
        val menuBtn = findViewById<Button>(R.id.menuBtn)

        menuBtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
        }
    }
}