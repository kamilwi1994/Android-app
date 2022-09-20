package com.example.vetplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ProceduraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procedura)


        val intent = intent
        val waga = intent.getStringExtra("Waga")
        val rodzaj = intent.getStringExtra("Rodzaj")
        val wagaView = findViewById<TextView>(R.id.wagaView)
        "Waga: $waga kg   Rodzaj: $rodzaj".also { wagaView.text = it }

        val buttonLek = findViewById<Button>(R.id.buttonLek)

        buttonLek.setOnClickListener {
            val intent = Intent(this, bolActivity::class.java)

            intent.putExtra("Waga", waga)
            intent.putExtra("Rodzaj", rodzaj)
            startActivity(intent)


        }
        val buttonSen = findViewById<Button>(R.id.buttonSen)
        buttonSen.setOnClickListener {
            val intent = Intent(this, SenActivity::class.java)

            intent.putExtra("Waga", waga)
            intent.putExtra("Rodzaj", rodzaj)
            startActivity(intent)


        }
        val menuBtn = findViewById<Button>(R.id.menuBtn)

        menuBtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
        }
    }
}