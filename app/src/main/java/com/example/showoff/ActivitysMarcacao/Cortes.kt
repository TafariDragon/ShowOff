package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityCortesBinding

class Cortes : AppCompatActivity() {
    private  lateinit var  binding: ActivityCortesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCortesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nomeCliente = intent.getStringExtra("NomeCliente")
        val contactoCliente= intent.getStringExtra("contactoCliente")

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnPunk.setOnClickListener {
            val valorCorte=50.0
            val nomeCorte="Punk"
            startActivity(Intent(this,BarbeiroNivel::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte.toString())
                .putExtra("NomeCorte",nomeCorte))
        }

        binding.btnPunkFino.setOnClickListener {
            val valorCorte="150.0"
            val nomeCorte="Punk Fino"
            startActivity(Intent(this,BarbeiroNivel::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte.toString())
                .putExtra("NomeCorte",nomeCorte))
        }

        binding.btnJuba.setOnClickListener {
            val valorCorte="50.0"
            val nomeCorte="Juba"
            startActivity(Intent(this,BarbeiroNivel::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte))
        }

        binding.btnCrista.setOnClickListener {
            val valorCorte="50.0"
            val nomeCorte="Crista"
            startActivity(Intent(this,BarbeiroNivel::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte))
        }

        binding.btnMoicano.setOnClickListener {
            val valorJuba="250.0"
            val nomeCorte="Moicano"
            startActivity(Intent(this,BarbeiroNivel::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorJuba)
                .putExtra("NomeCorte",nomeCorte))
        }
    }
}