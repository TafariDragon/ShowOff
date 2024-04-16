package com.example.showoff

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.showoff.databinding.ActivityCreateAccountBinding

class CreateAccount : AppCompatActivity() {
    private lateinit var binding: ActivityCreateAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }



        binding.btnCadastrar.setOnClickListener {
            var nome_cliente = binding.txtNome.text.toString()
            var apelidio_cliente= binding.txtApelido.text.toString()
            var contacto_cliente = binding.txtContacto.text.toString()
            var senhaInicial_cliente = binding.txtCriarSenha.text.toString()
            var senhaFinal_cliente = binding.txtConfirmarSenha.text.toString()
            val urlAPIShowoff="http://192.168.43.49/showoffAPI/insert.php"
            val queue:RequestQueue=Volley.newRequestQueue(this)
            var resultadoPost=object : StringRequest(Request.Method.POST,urlAPIShowoff,
                Response.Listener<String> { response ->
                    Toast.makeText(this,"DADOS SALVOS",Toast.LENGTH_LONG).show()
                },Response.ErrorListener { error ->
                    Toast.makeText(this,"FALHA NA INSERÇÃO DE DADOS $error",Toast.LENGTH_LONG).show()
                }){

                override fun getParams(): MutableMap<String, String>? {
                    val parametros = HashMap<String,String>()
                    parametros.put("Nome_C",nome_cliente)
                    parametros.put("Apelido_C",apelidio_cliente)
                    parametros.put("Contacto_C",contacto_cliente)
                    parametros.put("Senha_C",senhaInicial_cliente)
                    return parametros
                }

            }

            queue.add(resultadoPost)

        }
    }
}
