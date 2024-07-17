package com.example.showoff

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.ActivityClientes.DadosCliente
import com.example.showoff.ActivitysMarcacao.MarcacaoCorte1
import com.example.showoff.databinding.ActivityCatalogoBarbeiroBinding

class Catalogo_Barbeiro : AppCompatActivity() {
    private lateinit var  binding: ActivityCatalogoBarbeiroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatalogoBarbeiroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val idCliente = intent.getStringExtra("idCliente").toString()
        val nomeCliente = intent.getStringExtra("NomeCliente").toString()
        val apelidoCliente= intent.getStringExtra("apelidoCliente").toString()
        val senhaCliente= intent.getStringExtra("senhaCliente").toString()
        val contactoCliente= intent.getStringExtra("contactoCliente").toString()
        val valorCorte=intent.getStringExtra("ValorCorte").toString()
        val nomeCorte=intent.getStringExtra("NomeCorte").toString()
        val nomeBarbeiro= intent.getStringExtra("NomeBarbeiro").toString()
        val horaMarcacao=intent.getStringExtra("HorasMarcacao").toString()
        val dataMarcacao=intent.getStringExtra("DataMarcacao").toString()
        val carteiraMovel=intent.getStringExtra("CarteiraMovel").toString()
        binding.iconBack.setOnClickListener {
            startActivity(Intent(this,MenuPrincipal::class.java))

        }

        binding.iconHOme.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }

        binding.btnRealizarMarcacao.setOnClickListener {
            startActivity(Intent(this,MarcacaoCorte1::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente))
        }

        binding.lblNomeUtilizador.setText(nomeCliente)


        binding.iconEdit.setOnClickListener {
            startActivity(Intent(this, DadosCliente::class.java)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("apelidoCliente",apelidoCliente)
                .putExtra("senhaCliente",senhaCliente)
                .putExtra("idCliente",idCliente))
        }

        binding.btnVerificarMarcacao.setOnClickListener {
            startActivity(Intent(this,VerificarMarcao::class.java)
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