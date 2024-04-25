package com.example.showoff

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityVerificarMarcaoBinding

class VerificarMarcao : AppCompatActivity() {
    private lateinit var  binding:ActivityVerificarMarcaoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVerificarMarcaoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeCliente = intent.getStringExtra("NomeCliente").toString()
        val contactoCliente= intent.getStringExtra("contactoCliente").toString()
        val valorCorte=intent.getStringExtra("ValorCorte")?.toDoubleOrNull() ?: 0.0
        val nomeCorte=intent.getStringExtra("NomeCorte").toString()
        val nomeBarbeiro= intent.getStringExtra("NomeBarbeiro").toString()
        val horaMarcacao=intent.getStringExtra("HorasMarcacao").toString()
        val dataMarcacao=intent.getStringExtra("DataMarcacao").toString()
        val carteiraMovel=intent.getStringExtra("CarteiraMovel").toString()

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.textoDadosMarcacao.setText("CORTE: $nomeCorte \nBARBEIRO: $nomeBarbeiro \nHORAS: $horaMarcacao \nPAGAMENTO: $carteiraMovel \nVALOR: $valorCorte mt")
    }
}