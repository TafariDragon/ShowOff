package com.example.showoff

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.BackEnd.LoginManager
import com.example.showoff.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private  lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCadastrar.setOnClickListener {
            startActivity(Intent(this, CreateAccount::class.java))
            finish()
        }

        binding.btnEntrar.setOnClickListener {
            val contacto = binding.txtLoginContactoUtilizador.text.toString().trim()
            val senha = binding.txtSenhaLoginContactoUtilizador.text.toString().trim()

            if (contacto.isBlank() || senha.isBlank()) {
                Toast.makeText(this, "Preencha os campos para poder Entrar", Toast.LENGTH_LONG)
                    .show()
            } else {
                val loginManager = LoginManager(this)
                loginManager.fazerLogin(contacto, senha, object : LoginManager.LoginListener {
                    override fun onLoginSuccess() {
                        Toast.makeText(this@Login, "Bem-vindo", Toast.LENGTH_LONG).show()
                    }

                    override fun onUserNotExist() {
                        Toast.makeText(this@Login, "Este usuário não existe", Toast.LENGTH_LONG).show()
                    }

                    override fun onLoginError(errorMessage: String) {
                      Toast.makeText(this@Login,errorMessage,Toast.LENGTH_LONG).show()
                    }
                })

            }
        }
    }
}