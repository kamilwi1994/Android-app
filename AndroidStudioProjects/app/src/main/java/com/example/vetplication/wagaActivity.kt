package com.example.vetplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class wagaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waga)

        val intent = intent
        val rodzaj = intent.getStringExtra("Rodzaj")

        val wEditText = findViewById<EditText>(R.id.wEditText)
        val confirmBtn = findViewById<Button>(R.id.confirmBtn)

        confirmBtn.setOnClickListener {


            val waga = wEditText.text.toString()
            if(waga == "")
            {
                Toast.makeText(applicationContext, "podaj wagę", Toast.LENGTH_LONG).show()
            }
            else
            {
            val intent = Intent(this, ProceduraActivity::class.java)

                intent.putExtra("Waga", waga)
                intent.putExtra("Rodzaj", rodzaj)
                startActivity(intent)


            }
        }
    }
}
