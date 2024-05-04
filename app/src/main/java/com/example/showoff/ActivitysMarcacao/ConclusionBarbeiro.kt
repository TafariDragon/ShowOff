package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
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
        val valorCorte=intent.getStringExtra("ValorCorte").toString()
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

            val urlAPIShowoff = "http://192.168.43.49/showoffAPI/maracao.php"

            val queue: RequestQueue = Volley.newRequestQueue(this)
            val resultadoPost = object : StringRequest(
                Request.Method.POST, urlAPIShowoff,
                Response.Listener<String> { response ->
                    Toast.makeText(this, "MARCAÇÃO FEITA", Toast.LENGTH_LONG).show()
                }, Response.ErrorListener { error ->
                    Toast.makeText(this, "FALHA NA MARCAÇÃO $error", Toast.LENGTH_LONG).show()
                }) {

                override fun getParams(): MutableMap<String, String> {
                    val parametros = HashMap<String, String>()
                    parametros["Contacto_C"] = contactoCliente
                    parametros["Nome_C"] = nomeCliente
                    parametros["Servico"] = nomeCorte
                    parametros["Nome_B"] = nomeBarbeiro
                    parametros["Data_M"] = dataMarcacao
                    parametros["Horas_M"] = horaMarcacao
                    parametros["C_Movel"] = carteiraMovel
                    parametros["Valor"] = valorCorte
                    return parametros
                }

                override fun getHeaders(): MutableMap<String, String> {
                    val headers = HashMap<String, String>()
                    // Se necessário, adicione cabeçalhos aqui
                    return headers
                }
            }

            queue.add(resultadoPost)




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