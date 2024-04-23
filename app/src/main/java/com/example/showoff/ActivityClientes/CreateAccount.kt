package com.example.showoff.ActivityClientes

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.showoff.Login
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


            var nome_cliente = binding.txtNome.text.toString().trim()
            var apelidio_cliente= binding.txtApelido.text.toString().trim()
            var contacto_cliente = binding.txtContacto.text.toString().trim()
            var senhaInicial_cliente = binding.txtCriarSenha.text.toString().trim()
            var senhaFinal_cliente = binding.txtConfirmarSenha.text.toString().trim()

            if(nome_cliente==""||apelidio_cliente==""||contacto_cliente==""||senhaInicial_cliente==""||senhaFinal_cliente=="")
            {

                Toast.makeText(this,"Algum campo encotra-se Vazio",Toast.LENGTH_LONG).show()
            }else if(senhaFinal_cliente!=senhaInicial_cliente){
                Toast.makeText(this,"As senhas introduzidas não são semelhantes",Toast.LENGTH_LONG).show()
            }else{


                val urlAPIShowoff = "http://192.168.43.49/showoffAPI/insert.php"
                val queue: RequestQueue = Volley.newRequestQueue(this)
                var resultadoPost = object : StringRequest(Request.Method.POST, urlAPIShowoff,
                    Response.Listener<String> { response ->
                        Toast.makeText(this, "DADOS SALVOS", Toast.LENGTH_LONG).show()
                    }, Response.ErrorListener { error ->
                        Toast.makeText(this, "FALHA NA INSERÇÃO DE DADOS $error", Toast.LENGTH_LONG)
                            .show()
                    }) {

                    override fun getParams(): MutableMap<String, String>? {
                        val parametros = HashMap<String, String>()
                        parametros.put("Nome_C", nome_cliente)
                        parametros.put("Apelido_C", apelidio_cliente)
                        parametros.put("Contacto_C", contacto_cliente)
                        parametros.put("Senha_C", senhaInicial_cliente)
                        return parametros
                    }

                }

                queue.add(resultadoPost)
                startActivity(Intent(this, Login::class.java))
            }

        }
    }
}
