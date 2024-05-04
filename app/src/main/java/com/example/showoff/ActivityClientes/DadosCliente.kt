package com.example.showoff.ActivityClientes

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.showoff.databinding.ActivityDadosClienteBinding

class DadosCliente : AppCompatActivity() {
    private lateinit var binding:ActivityDadosClienteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDadosClienteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val idCliente = intent.getStringExtra("idCliente").toString()
        val nomeCliente = intent.getStringExtra("NomeCliente").toString()
        val apelidoCliente= intent.getStringExtra("apelidoCliente").toString()
        val senhaCliente= intent.getStringExtra("senhaCliente").toString()
        val contactoCliente= intent.getStringExtra("contactoCliente").toString()
        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.lblNomeUtilizador.setText(nomeCliente+idCliente)
        binding.txtNome.setText(nomeCliente)
        binding.txtApelido.setText(apelidoCliente)
        binding.txtContacto.setText(contactoCliente)
        binding.txtSenha.setText(senhaCliente)


        binding.btnAlterar.setOnClickListener {
            val urlAlterar="http://192.168.43.49/showoffAPI/alterar.php"
             var nomeC=binding.txtNome.text.toString()
            var apelidoC=binding.txtApelido.text.toString()
            var contactoC=binding.txtContacto.text.toString()
            var senhaC=binding.txtSenha.text.toString()


            val queue: RequestQueue = Volley.newRequestQueue(this)
            val resultPost = object:StringRequest(Request.Method.POST,urlAlterar,
                Response.Listener {response ->
                    Toast.makeText(this,"Dados Alterados com sucesso",Toast.LENGTH_LONG).show()
            },Response.ErrorListener {error ->
                    Toast.makeText(this,"Erro na Alteração de Dados $error",Toast.LENGTH_LONG).show()
                }){
                override fun getParams(): MutableMap<String, String>? {
                    val parametros = HashMap<String, String>()
                    parametros.put("id_Clientes",idCliente)
                    parametros.put("Nome_C",nomeC)
                    parametros.put("Apelido_C",apelidoC)
                    parametros.put("Contacto_C",contactoC)
                    parametros.put("Senha_C",senhaC)

                    return parametros

                }
            }

            queue.add(resultPost)
        }

    }
}