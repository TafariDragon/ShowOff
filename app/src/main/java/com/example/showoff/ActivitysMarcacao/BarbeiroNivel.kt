package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityBarbeiroNivelBinding

class BarbeiroNivel : AppCompatActivity() {
    private  lateinit var  binding:ActivityBarbeiroNivelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBarbeiroNivelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeCliente = intent.getStringExtra("NomeCliente")
        val contactoCliente= intent.getStringExtra("contactoCliente")
        val valorCorte=intent.getStringExtra("ValorCorte")
        val nomeCorte=intent.getStringExtra("NomeCorte")

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnJose.setOnClickListener {
            var nomeBarbeiro="José"
            startActivity(Intent(this,Horario::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro))
        }

        binding.btnDercio.setOnClickListener {
            var nomeBarbeiro="Dercio"
            startActivity(Intent(this,Horario::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro))
        }

        binding.btnMateus.setOnClickListener {
            var nomeBarbeiro="Mateus"
            startActivity(Intent(this,Horario::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro))
        }

        binding.btnPedro.setOnClickListener {
            var nomeBarbeiro="Pedro"
            startActivity(Intent(this,Horario::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro))
        }
    }
}