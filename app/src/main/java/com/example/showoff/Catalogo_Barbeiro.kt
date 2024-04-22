package com.example.showoff

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.ActivitysMarcacao.MarcacaoCorte1
import com.example.showoff.databinding.ActivityCatalogoBarbeiroBinding

class Catalogo_Barbeiro : AppCompatActivity() {
    private lateinit var  binding: ActivityCatalogoBarbeiroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatalogoBarbeiroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeCliente = intent.getStringExtra("NomeCliente")
        binding.iconBack.setOnClickListener {
            startActivity(Intent(this,MenuPrincipal::class.java))

        }

        binding.btnRealizarMarcacao.setOnClickListener {
            startActivity(Intent(this,MarcacaoCorte1::class.java))
        }

        binding.lblNomeUtilizador.setText(nomeCliente)
    }
}