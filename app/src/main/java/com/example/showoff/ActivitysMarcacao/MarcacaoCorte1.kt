package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityMarcacaoCorte1Binding

class MarcacaoCorte1 : AppCompatActivity() {
    private lateinit var  binding : ActivityMarcacaoCorte1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMarcacaoCorte1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeCliente = intent.getStringExtra("NomeCliente")
        val contactoCliente= intent.getStringExtra("contactoCliente")

        binding.iconBack.setOnClickListener {
           onBackPressed()
        }

        binding.btnCabelo.setOnClickListener {
            startActivity(Intent(this,Cortes::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente))
        }

    }
}