package com.david.theconstructor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var piso = arrayOf("azulejo cristo azul 20x30 $6.89", "Baldoza dal gres 34x50 $11.05", "Azulejo 25x40\n" +
                "absolut beige $8.93", "Azulejo 25x40 heraldo marfil $9.35", "Azulejo 25x40 absolut beige 8.93",
            "Porcelanato 40x60 stoneblend bianco $14.46", "Porcelanato 60x90 ixtla fd hueso $16.09", "Porcelanato 120x120 sensi statuario $63.82")
                spinProductos.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, piso)
        spinProductos.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, piso[position], Toast.LENGTH_LONG).show()
            }

        }



        btCalcular.setOnClickListener {
            var etTamanio = findViewById<EditText>(R.id.etMetros)
            //var etPiso = findViewById<EditText>(R.id.etTipo)
            var tamanio:String = etTamanio.text.toString()
            //var piso:String = etPiso.text.toString()

            val presupuesto = Intent(this, Presupuesto::class.java)


            presupuesto.putExtra("tamanio", tamanio)
            startActivity(presupuesto)
        }








    }
}
