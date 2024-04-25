package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.Catalogo_Barbeiro
import com.example.showoff.databinding.ActivityConclusionBarbeiroBinding

class ConclusionBarbeiro : AppCompatActivity() {
    private lateinit var  binding: ActivityConclusionBarbeiroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConclusionBarbeiroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeCliente = intent.getStringExtra("NomeCliente").toString()
        val contactoCliente= intent.getStringExtra("contactoCliente").toString()
        val valorCorte=intent.getStringExtra("ValorCorte")
        val nomeCorte=intent.getStringExtra("NomeCorte").toString()
        val nomeBarbeiro= intent.getStringExtra("NomeBarbeiro").toString()
        val horaMarcacao=intent.getStringExtra("HorasMarcacao").toString()
        val dataMarcacao=intent.getStringExtra("DataMarcacao").toString()
        val carteiraMovel=intent.getStringExtra("CarteiraMovel").toString()

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.lblConclusion.setText("Para realizar a marcação envie o valor $valorCorte mt para este número")

        binding.btnConculir.setOnClickListener {


            /*


            val urlAPIShowoff = "http://192.168.43.49/showoffAPI/maracao.php"
            val queue: RequestQueue = Volley.newRequestQueue(this)
            var resultadoPost = object : StringRequest(Request.Method.GET, urlAPIShowoff,
                Response.Listener<String> { response ->
                    Toast.makeText(this, "MARCAÇÃO FEITA", Toast.LENGTH_LONG).show()
                }, Response.ErrorListener { error ->
                    Toast.makeText(this, "FALHA NA MARCAÇÃO $error", Toast.LENGTH_LONG).show()
                }) {

                override fun getParams(): MutableMap<String, String>? {
                    val parametros = HashMap<String, String>()
                    parametros.put("Contacto_C", contactoCliente)
                    parametros.put("Nome_C", nomeCliente)
                    parametros.put("Servico", nomeCorte)
                    parametros.put("Nome_B", nomeBarbeiro)
                    parametros.put("Data_M", dataMarcacao)
                    parametros.put("Horas_M", horaMarcacao)
                    parametros.put("C_Movel",carteiraMovel)
                    parametros.put("Valor", valorCorte)
                    return parametros
                }

            }

            queue.add(resultadoPost)

             */

            startActivity(Intent(this,Catalogo_Barbeiro::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro)
                .putExtra("HorasMarcacao",horaMarcacao)
                .putExtra("DataMarcacao",dataMarcacao)
                .putExtra("CarteiraMovel",carteiraMovel))

        }
    }
}