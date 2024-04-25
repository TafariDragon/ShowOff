package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityPagamentoBinding

class Pagamento : AppCompatActivity() {
    private  lateinit var binding:ActivityPagamentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPagamentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeCliente = intent.getStringExtra("NomeCliente")
        val contactoCliente= intent.getStringExtra("contactoCliente")
        val valorCorte=intent.getStringExtra("ValorCorte")
        val nomeCorte=intent.getStringExtra("NomeCorte")
        val nomeBarbeiro= intent.getStringExtra("NomeBarbeiro")
        val horaMarcacao=intent.getStringExtra("HorasMarcacao")
        val dataMarcacao=intent.getStringExtra("DataMarcacao")

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnMpesa.setOnClickListener {
            var carteiraMovel="M-Pesa"
            startActivity(Intent(this,ConclusionBarbeiro::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro)
                .putExtra("HorasMarcacao",horaMarcacao)
                .putExtra("DataMarcacao",dataMarcacao)
                .putExtra("CarteiraMovel",carteiraMovel))

        }

        binding.btnEmola.setOnClickListener {
            var carteiraMovel="EMOLA"
            startActivity(Intent(this,ConclusionBarbeiro::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro)
                .putExtra("HorasMarcacao",horaMarcacao)
                .putExtra("DataMarcacao",dataMarcacao)
                .putExtra("CarteiraMovel",carteiraMovel))

        }

        binding.btnMkesh.setOnClickListener {
            var carteiraMovel="MKESH"
            startActivity(Intent(this,ConclusionBarbeiro::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro)
                .putExtra("HorasMarcacao",horaMarcacao)
                .putExtra("DataMarcacao",dataMarcacao)
                .putExtra("CarteiraMovel",carteiraMovel))

        }

        binding.btnContamovel.setOnClickListener {
            var carteiraMovel="CONTA MOVÉL"
            startActivity(Intent(this,ConclusionBarbeiro::class.java)
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