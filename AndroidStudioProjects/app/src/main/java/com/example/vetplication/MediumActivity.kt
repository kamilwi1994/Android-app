package com.example.vetplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.*
import java.math.BigDecimal
import java.math.RoundingMode

class MediumActivity : AppCompatActivity(), OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medium)

        val intent = intent
        val rodzaj = intent.getStringExtra("Rodzaj")
        val siła = intent.getStringExtra("Siła")


        val spinner = findViewById<Spinner>(R.id.medPrepSpinner)

        if (rodzaj == "Pies" && siła == "mid") {
            val adapter = ArrayAdapter.createFromResource(
                this,
                R.array.dogMedMid,
                android.R.layout.simple_spinner_item
            )
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
            spinner.onItemSelectedListener = this
        }
        if (rodzaj == "Pies" && siła == "high") {
            val adapter = ArrayAdapter.createFromResource(
                this,
                R.array.dogMedHigh,
                android.R.layout.simple_spinner_item
            )
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
            spinner.onItemSelectedListener = this
        }
        if (rodzaj == "Kot" && siła == "mid") {
            val adapter = ArrayAdapter.createFromResource(
                this,
                R.array.catMedMid,
                android.R.layout.simple_spinner_item
            )
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
            spinner.onItemSelectedListener = this
        }
        if (rodzaj == "Kot" && siła == "high") {
            val adapter = ArrayAdapter.createFromResource(
                this,
                R.array.catMedHigh,
                android.R.layout.simple_spinner_item
            )
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
            spinner.onItemSelectedListener = this
        }

        val menuBtn = findViewById<Button>(R.id.menuBtn)

        menuBtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, p3: Long) {
        val lek:String = parent?.getItemAtPosition(position) as String
        val intent = intent
        val waga = intent.getStringExtra("Waga")?.toDouble()
        val rodzaj = intent.getStringExtra("Rodzaj")
        val siła = intent.getStringExtra("Siła")

        var dawka1 = 0.0
        var dawka2 = 0.0
        var iloscprep1 = 0.0
        var iloscprep2 = 0.0
        var iloscprep3 = 0.0
        var iloscprep4 = 0.0
        var iloscprep5 = 0.0

        var preparat1 = ""
        var preparat2 = ""
        var preparat3 = ""
        var preparat4 = ""
        var preparat5 = ""
        var tab = ""



        if(lek == "metamizol"&& rodzaj == "Pies" && siła == "mid") {
            dawka1 = 10.0
            dawka2 = 50.0
            preparat1 = "pyralgivet 500mg/ml"
            preparat2 = "biovetalgin 500mg/ml"
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 500.0
            iloscprep2 = 500.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""



        }
        if(lek == "kwas tolfenamowy" && rodzaj == "Pies" && siła == "mid") {
            dawka1 = 4.0
            dawka2 = 0.0
            preparat1 = "kwas tolfenamowy 40mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 40.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""

        }
        if(lek == "meloksykam" && rodzaj == "Pies" && siła == "mid") {
            dawka1 = 0.2
            dawka2 = 0.0
            preparat1 = "melovem 5mg/ml"
            preparat2 = "melovem 20mg/ml"
            preparat3 = "melovem 30mg/ml"
            preparat4 = "melovem 0.5mg/ml"
            preparat5 = "melovem 1.5mg/ml"
            iloscprep1 = 5.0
            iloscprep2 = 20.0
            iloscprep3 = 30.0
            iloscprep4 = 0.5
            iloscprep5 = 1.5
            tab = ""


        }
        if(lek == "gabapentyna"&& rodzaj == "Pies" && siła == "mid") {
            dawka1 = 10.0
            dawka2 = 0.0
            preparat1 = "gabapentyna 100mg/tab"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 100.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = "tak"
        }
        if(lek == "grapiprant"&& rodzaj == "Pies" && siła == "mid") {
            dawka1 = 2.0
            dawka2 = 0.0
            preparat1 = "grapiprant 100mg/tab"
            preparat2 = "grapiprant 60mg/tab"
            preparat3 = "grapiprant 200mg/tab"
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 100.0
            iloscprep2 = 60.0
            iloscprep3 = 200.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = "tak"
        }
        if(lek == "cimikoksyb"&& rodzaj == "Pies" && siła == "mid") {
            dawka1 = 2.0
            dawka2 = 0.0
            preparat1 = "cimikoksyb 80mg/tab"
            preparat2 = "cimikoksyb 30mg/tab"
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 80.0
            iloscprep2 = 30.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = "tak"
        }
        if(lek == "karprofen"&& rodzaj == "Pies" && siła == "mid") {
            dawka1 = 2.0
            dawka2 = 4.0
            preparat1 = "karprofen 50mg/tab"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 50.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "firokoksyb"&& rodzaj == "Pies" && siła == "mid") {
            dawka1 = 5.0
            dawka2 = 0.0
            preparat1 = "firokoksyb 57mg/tab"
            preparat2 = "firokoksyb 227mg/tab"
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 57.0
            iloscprep2 = 227.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = "tak"
        }
        if(lek == "fluniksyna"&& rodzaj == "Pies" && siła == "mid") {
            dawka1 = 0.25
            dawka2 = 0.0
            preparat1 = "fluniksyna 50mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 50.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "maropitant"&& rodzaj == "Pies" && siła == "mid") {
            dawka1 = 1.0
            dawka2 = 0.0
            preparat1 = "maropitant 10mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 10.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "robenakoksyb"&& rodzaj == "Pies" && siła == "mid") {
            dawka1 = 2.0
            dawka2 = 0.0
            preparat1 = "robenakoksyb 40mg/tab"
            preparat2 = "robenakoksyb 20mg/tab"
            preparat3 = "robenakoksyb 20mg/ml"
            preparat4 = "robenakoksyb 6mg/tab"
            preparat5 = "robenakoksyb 5mg/tab"
            iloscprep1 = 40.0
            iloscprep2 = 20.0
            iloscprep3 = 20.0
            iloscprep4 = 6.0
            iloscprep5 = 5.0
            tab = "tak"
        }

        if(lek == "metadon" && rodzaj == "Pies" && siła == "high") {
            dawka1 = 0.5
            dawka2 = 1.0
            preparat1 = "metadon 10mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 10.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "fentanyl"&& rodzaj == "Pies" && siła == "high") {
            dawka1 = 4.0
            dawka2 = 0.0
            preparat1 = "fentanyl 25ug/h"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 25.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0


        }
        if(lek == "buprenorfina" && rodzaj == "Pies" && siła == "high") {
                dawka1 = 0.01
                dawka2 = 0.04
                preparat1 = "buprenorfina 0.3mg/ml"
                preparat2 = ""
                preparat3 = ""
                preparat4 = ""
                preparat5 = ""
                iloscprep1 = 0.3
                iloscprep2 = 0.0
                iloscprep3 = 0.0
                iloscprep4 = 0.0
                iloscprep5 = 0.0
                tab = ""
            }
        if(lek == "tramadol" && rodzaj == "Pies" && siła == "high") {
            dawka1 = 4.0
            dawka2 = 6.0
            preparat1 = "tramadol 50mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 50.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "butorfanol" && rodzaj == "Pies" && siła == "high") {
            dawka1 = 0.2
            dawka2 = 0.4
            preparat1 = "butorfanol 10mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 0.3
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }


        if(lek == "metadon" && rodzaj == "Kot" && siła == "high") {
            dawka1 = 0.3
            dawka2 = 0.6
            preparat1 = "metadon 10mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 10.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "buprenorfina" && rodzaj == "Kot" && siła == "high") {
            dawka1 = 0.02
            dawka2 = 0.04
            preparat1 = "buprenorfina 0.3mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 0.3
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "tramadol" && rodzaj == "Kot" && siła == "high") {
            dawka1 = 2.0
            dawka2 = 4.0
            preparat1 = "tramadol 50mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 50.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "butorfanol" && rodzaj == "Kot" && siła == "high") {
            dawka1 = 0.2
            dawka2 = 0.4
            preparat1 = "tramadol 10mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 10.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }

        if(lek == "kwas tolfenamowy" && rodzaj == "Kot" && siła == "mid") {
            dawka1 = 4.0
            dawka2 = 0.0
            preparat1 = "kwas tolfenamowy 40mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 40.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "meloksykam" && rodzaj == "Kot" && siła == "mid") {
            dawka1 = 0.3
            dawka2 = 0.0
            preparat1 = "meloksykam 30mg/ml"
            preparat2 = "meloksykam 20mg/ml"
            preparat3 = "meloksykam 5mg/ml"
            preparat4 = "meloksykam 1.5mg/ml"
            preparat5 = "meloksykam 0.5mg/ml"
            iloscprep1 = 30.0
            iloscprep2 = 20.0
            iloscprep3 = 5.0
            iloscprep4 = 1.5
            iloscprep5 = 0.5
            tab = ""
        }
        if(lek == "gabapentyna" && rodzaj == "Kot" && siła == "mid") {
            dawka1 = 5.0
            dawka2 = 10.0
            preparat1 = "gabapentyna 100mg/tab"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 100.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = "tak"
        }
        if(lek == "karprofen" && rodzaj == "Kot" && siła == "mid") {
            dawka1 = 2.0
            dawka2 = 4.0
            preparat1 = "karprofen 50mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 50.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "fluniksyna" && rodzaj == "Kot" && siła == "mid") {
            dawka1 = 0.25
            dawka2 = 0.0
            preparat1 = "fluniksyna 50mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 50.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "maropitant" && rodzaj == "Kot" && siła == "mid") {
            dawka1 = 1.0
            dawka2 = 0.0
            preparat1 = "maropitant 10mg/ml"
            preparat2 = ""
            preparat3 = ""
            preparat4 = ""
            preparat5 = ""
            iloscprep1 = 10.0
            iloscprep2 = 0.0
            iloscprep3 = 0.0
            iloscprep4 = 0.0
            iloscprep5 = 0.0
            tab = ""
        }
        if(lek == "robenakoksyb" && rodzaj == "Kot" && siła == "mid") {
            dawka1 = 1.0
            dawka2 = 2.4
            preparat1 = "robenakoksyb 40mg/tab"
            preparat2 = "robenakoksyb 20mg/tab"
            preparat3 = "robenakoksyb 20mg/ml"
            preparat4 = "robenakoksyb 6mg/tab"
            preparat5 = "robenakoksyb 5mg/tab"
            iloscprep1 = 40.0
            iloscprep2 = 20.0
            iloscprep3 = 20.0
            iloscprep4 = 6.0
            iloscprep5 = 5.0
            tab = "tak"
        }


        val tekstLek1 =findViewById<TextView>(R.id.textLek1)
        val tekstLek2 =findViewById<TextView>(R.id.textLek2)
        val tekstLek3 =findViewById<TextView>(R.id.textLek3)
        val tekstLek4 =findViewById<TextView>(R.id.textLek4)
        val tekstLek5 =findViewById<TextView>(R.id.textLek5)
        val tekstDawka1 =findViewById<TextView>(R.id.textDawka1)
        val tekstDawka2 =findViewById<TextView>(R.id.textDawka2)
        val tekstDawka3 =findViewById<TextView>(R.id.textDawka3)
        val tekstDawka4 =findViewById<TextView>(R.id.textDawka4)
        val tekstDawka5 =findViewById<TextView>(R.id.textDawka5)
        val tekstIlosc1 =findViewById<TextView>(R.id.textIlosc1)
        val tekstIlosc2 =findViewById<TextView>(R.id.textIlosc2)
        val tekstIlosc3 =findViewById<TextView>(R.id.textIlosc3)
        val tekstIlosc4 =findViewById<TextView>(R.id.textIlosc4)
        val tekstIlosc5 =findViewById<TextView>(R.id.textIlosc5)


        tekstLek1.text = preparat1
        tekstLek2.text = preparat2
        tekstLek3.text = preparat3
        tekstLek4.text = preparat4
        tekstLek5.text = preparat5
        tekstDawka2.text = ""
        tekstDawka3.text = ""
        tekstDawka4.text = ""
        tekstDawka5.text = ""
        tekstIlosc2.text = ""
        tekstIlosc3.text = ""
        tekstIlosc4.text = ""
        tekstIlosc5.text = ""



        val wynik1 = dawka1*waga!!/iloscprep1
        val wynik2 = dawka1*waga/iloscprep2
        val wynik3 = dawka1*waga/iloscprep3
        val wynik4 = dawka1*waga/iloscprep4
        val wynik5 = dawka1*waga/iloscprep5
        val wynik11 = dawka2*waga/iloscprep1
        val wynik22 = dawka2*waga/iloscprep2
        val wynik33 = dawka2*waga/iloscprep3
        val wynik44 = dawka2*waga/iloscprep4
        val wynik55 = dawka2*waga/iloscprep5
        val wynikDawka1 = dawka1* waga
        val wynikDawka2 = dawka2* waga





        (""+BigDecimal(wynikDawka1).setScale(2, RoundingMode.HALF_EVEN)  + if(dawka2 != 0.0){"-"+ BigDecimal(wynikDawka2).setScale(2, RoundingMode.HALF_EVEN) + "mg"} else "mg").also { tekstDawka1.text = it }
        (""+ BigDecimal(wynik1).setScale(3, RoundingMode.HALF_EVEN) + if(dawka2 != 0.0){ "-"+BigDecimal(wynik11).setScale(3, RoundingMode.HALF_EVEN) + if(tab == "tak"){"szt"} else "ml"} else if(tab == "tak"){"szt"} else "ml").also { tekstIlosc1.text = it }
        if(preparat2 != "") {
            (""+BigDecimal(wynikDawka1).setScale(2, RoundingMode.HALF_EVEN)  + if(dawka2 != 0.0){"-"+ BigDecimal(wynikDawka2).setScale(2, RoundingMode.HALF_EVEN) + "mg"} else "mg").also { tekstDawka2.text = it }
            (""+BigDecimal(wynik2).setScale(3, RoundingMode.HALF_EVEN) + if(dawka2 != 0.0){ "-"+BigDecimal(wynik22).setScale(3, RoundingMode.HALF_EVEN) + if(tab == "tak"){"szt"} else "ml"} else if(tab == "tak"){"szt"} else "ml").also { tekstIlosc2.text = it }
            if(preparat3 != ""){
                (""+BigDecimal(wynikDawka1).setScale(2, RoundingMode.HALF_EVEN)  + if(dawka2 != 0.0){"-"+ BigDecimal(wynikDawka2).setScale(2, RoundingMode.HALF_EVEN) + "mg"} else "mg").also { tekstDawka3.text = it }
                (""+BigDecimal(wynik3).setScale(3, RoundingMode.HALF_EVEN) + if(dawka2 != 0.0){ "-"+BigDecimal(wynik33).setScale(3, RoundingMode.HALF_EVEN) + if(tab == "tak"){"szt"} else "ml"} else if(tab == "tak"){"szt"} else "ml").also { tekstIlosc3.text = it }
            if(preparat4 != ""){
                (""+BigDecimal(wynikDawka1).setScale(2, RoundingMode.HALF_EVEN)  + if(dawka2 != 0.0){"-"+ BigDecimal(wynikDawka2).setScale(2, RoundingMode.HALF_EVEN) + "mg"} else "mg").also { tekstDawka4.text = it }
                (""+ BigDecimal(wynik4).setScale(3, RoundingMode.HALF_EVEN) + if(dawka2 != 0.0){ "-"+BigDecimal(wynik44).setScale(3, RoundingMode.HALF_EVEN) + if(tab == "tak"){"szt"} else "ml"} else if(tab == "tak"){"szt"} else "ml").also { tekstIlosc4.text = it }
            if(preparat5 != ""){
                (""+BigDecimal(wynikDawka1).setScale(2, RoundingMode.HALF_EVEN)  + if(dawka2 != 0.0){"-"+ BigDecimal(wynikDawka2).setScale(2, RoundingMode.HALF_EVEN) + "mg"} else "mg").also { tekstDawka5.text = it }
                (""+BigDecimal(wynik5).setScale(3, RoundingMode.HALF_EVEN) + if(dawka2 != 0.0){ "-"+BigDecimal(wynik55).setScale(3, RoundingMode.HALF_EVEN) + if(tab == "tak"){"szt"} else "ml"} else if(tab == "tak"){"szt"} else "ml").also { tekstIlosc5.text = it }

        }}}}
        if(preparat1 == "fentanyl 25ug/h"){
            (""+BigDecimal(wynikDawka1).setScale(2, RoundingMode.HALF_EVEN)  +  "ug/kg/h").also { tekstDawka1.text = it }
            (""+ BigDecimal(wynik1).setScale(1, RoundingMode.HALF_EVEN) +  "szt/h").also { tekstIlosc1.text = it }
            (" starczy na: 165 godzin").also { tekstIlosc2.text = it }
        }
        if(preparat3 == "robenakoksyb 20mg/ml"){
            (""+BigDecimal(wynik3).setScale(3, RoundingMode.HALF_EVEN) + if(dawka2 != 0.0){ "-"+BigDecimal(wynik33).setScale(3, RoundingMode.HALF_EVEN) +  "ml"}  else "ml").also { tekstIlosc3.text = it }

        }




    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}