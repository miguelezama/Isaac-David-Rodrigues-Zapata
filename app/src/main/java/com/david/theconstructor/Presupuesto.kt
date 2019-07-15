package com.david.theconstructor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_presupuesto.*

class Presupuesto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presupuesto)

        val tamIntent: Intent=intent
        var tamanio = tamIntent.getStringExtra("tamanio")
        txtTitulo.text = "Presupuesto de Piso $tamanio"


        //Toast.makeText(this, etTamanio.text, Toast.LENGTH_LONG).show()




    }
}
