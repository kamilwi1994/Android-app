package com.example.vetplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import java.math.BigDecimal
import java.math.RoundingMode

class SenProcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sen_proc)

        val intent = intent
        val waga = intent.getStringExtra("Waga")?.toDouble()
        val rodzaj = intent.getStringExtra("Rodzaj")
        val sen = intent.getStringExtra("Sen")

        val lek1 =findViewById<TextView>(R.id.lek1)
        val lek2 =findViewById<TextView>(R.id.lek2)
        val lek3 =findViewById<TextView>(R.id.lek3)
        val lek4 =findViewById<TextView>(R.id.lek4)
        val dawka1 =findViewById<TextView>(R.id.dawka1)
        val dawka2 =findViewById<TextView>(R.id.dawka2)
        val dawka3 =findViewById<TextView>(R.id.dawka3)
        val dawka4 =findViewById<TextView>(R.id.dawka4)
        val wynik1 =findViewById<TextView>(R.id.wynik1)
        val wynik2 =findViewById<TextView>(R.id.wynik2)
        val wynik3 =findViewById<TextView>(R.id.wynik3)
        val wynik4 =findViewById<TextView>(R.id.wynik4)
        var wynikW1 = 0.0
        var wynikW11 = 0.0
        var wynikW2 = 0.0
        var wynikW3 = 0.0
        var wynikW33 = 0.0
        var wynikW4 = 0.0
        var wynikW44 = 0.0

        if (sen == "premed") {
            lek1.text = "Deksmedetomidyna"
            lek2.text = "Methadon"
            dawka1.text = "0.003-0.005mg/kg"
            dawka2.text = "0.3mg/kg"
            wynikW1 = waga!! * 0.003
            wynikW11 = waga * 0.005
            wynikW2 = waga * 0.3
            wynikW3 = waga * 0.01
            wynikW4 = waga * 0.3
            (""+BigDecimal(wynikW1).setScale(2, RoundingMode.HALF_EVEN)  + "-" + BigDecimal(wynikW11).setScale(2, RoundingMode.HALF_EVEN) + "mg I.V.").also { wynik1.text = it }
            (""+BigDecimal(wynikW2).setScale(2, RoundingMode.HALF_EVEN)  +  "mg I.V.").also { wynik2.text = it }
            lek3.text = lek1.text
            lek4.text = lek2.text
            dawka3.text = "0.01mg/kg"
            dawka4.text = "0.3mg/kg"
            (""+BigDecimal(wynikW3).setScale(2, RoundingMode.HALF_EVEN)  +  "mg I.M.").also { wynik3.text = it }
            (""+BigDecimal(wynikW4).setScale(2, RoundingMode.HALF_EVEN)  +  "mg I.M.").also { wynik4.text = it }
        }
        if (sen == "ind") {
            lek1.text = "Propofol"
            lek2.text = ""
            dawka1.text = "1-5mg/kg"
            dawka2.text = ""
            lek2.setBackgroundColor(Color.TRANSPARENT)
            wynikW1 = waga!! * 1
            wynikW11 = waga * 5
            (""+BigDecimal(wynikW1).setScale(2, RoundingMode.HALF_EVEN)  + "-" + BigDecimal(wynikW11).setScale(2, RoundingMode.HALF_EVEN) + "mg I.V.").also { wynik1.text = it }
            wynik2.text = ""
            lek3.text = "Ketamina"
            lek4.text = "Diazepam"
            dawka3.text = "3-5mg/kg"
            dawka4.text = "0.1-0.3mg/kg"
            wynikW3 = waga * 3
            wynikW33 = waga * 5
            wynikW4 = waga * 0.1
            wynikW44 = waga * 0.3
            (""+BigDecimal(wynikW3).setScale(2, RoundingMode.HALF_EVEN)  + "-" + BigDecimal(wynikW33).setScale(2, RoundingMode.HALF_EVEN) + "mg I.V.").also { wynik3.text = it }
            (""+BigDecimal(wynikW4).setScale(2, RoundingMode.HALF_EVEN)  + "-" + BigDecimal(wynikW44).setScale(2, RoundingMode.HALF_EVEN) + "mg I.V.").also { wynik4.text = it }
        }
        val menuBtn = findViewById<Button>(R.id.menuBtn)

        menuBtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
        }

    }
}