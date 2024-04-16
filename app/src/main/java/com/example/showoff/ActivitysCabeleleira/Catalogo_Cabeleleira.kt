package com.example.showoff.ActivitysCabeleleira

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.MenuPrincipal
import com.example.showoff.databinding.ActivityCatalogoCabeleleiraBinding

class Catalogo_Cabeleleira : AppCompatActivity() {
    private lateinit var  binding: ActivityCatalogoCabeleleiraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatalogoCabeleleiraBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.iconBack.setOnClickListener {
            startActivity(Intent(this, MenuPrincipal::class.java))
            finish()
        }

        binding.btnRealizarMarcacao.setOnClickListener {
            startActivity(Intent(this,Marcacacao1Cabeleleira::class.java))
        }
    }
}