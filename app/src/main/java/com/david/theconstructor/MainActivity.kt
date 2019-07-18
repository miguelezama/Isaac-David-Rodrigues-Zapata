package com.david.theconstructor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var precioPiso = 0.0

        var piso = arrayOf("azulejo cristo azul 20x30 $6.89", "Baldoza dal gres 34x50 $11.05", "Azulejo 25x40\n" +
                "absolut beige $8.93", "Azulejo 25x40 heraldo marfil $9.35", "Azulejo 25x40 absolut beige $8.93",
            "Porcelanato 40x60 stoneblend bianco $14.46", "Porcelanato 60x90 ixtla fd hueso $16.09", "Porcelanato 120x120 sensi statuario $63.82")
                spinProductos.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, piso)
        spinProductos.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(position == 0){
                    precioPiso = 6.89
                }else if(position == 1){
                    precioPiso = 11.05
                }else if(position == 2){
                    precioPiso = 8.93
                }else if(position == 3){
                    precioPiso = 9.35
                }else if(position == 4){
                    precioPiso = 8.93
                }else if(position == 5){
                    precioPiso = 14.46
                }else if(position == 6){
                    precioPiso = 16.09
                }else if(position == 7){
                    precioPiso = 63.82
                }

                //Toast.makeText(this@MainActivity, piso[position], Toast.LENGTH_LONG).show()
                //Toast.makeText(this, precioPiso, Toast.LENGTH_LONG).show()
                //Toast.makeText(this@MainActivity, precioPiso.toString(), Toast.LENGTH_LONG).show()
            }

        }

        //val etMetros = EditText(this)
        //linearLayout.addView(etMetros)







        //cuarto = etMetros.toString() as Double
        /*//if(etMetros.text != null){
            cuarto = etMetros as Double
            total = cuarto * precioPiso * precio
            Toast.makeText(this@MainActivity, total.toString(), Toast.LENGTH_LONG).show()
        //}else{
            //Toast.makeText(this@MainActivity, "Datos Invalidos", Toast.LENGTH_LONG).show()
        //}
*/

        btCalcular.setOnClickListener {

            var etTamanio = findViewById<EditText>(R.id.etMetros)
            //var etPiso = findViewById<EditText>(R.id.etTipo)
            var tamanio:String = etTamanio.text.toString()
            //var piso:String = etPiso.text.toString()

            val presupuesto = Intent(this, Presupuesto::class.java)



            //var metro = findViewById<EditText>(R.id.etMetros)
            var input = 0.0

            //input = metro.text as Double

            var  precio =  0.5
            var total = 0.0

            total = (precioPiso * 25) + 3000
            //tamanio += precio * tamanio.toString() as Double
//            Toast.makeText(this, "El valor es " + total , Toast.LENGTH_LONG).show()


            presupuesto.putExtra("valor", total)
            presupuesto.putExtra("tamanio", tamanio )

            startActivity(presupuesto)
        }








    }
}
