package com.example.showoff.ActivitysCabeleleira

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityPagamentosCabeleleiraBinding

class PagamentosCabeleleira : AppCompatActivity() {
    private lateinit var  binding: ActivityPagamentosCabeleleiraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPagamentosCabeleleiraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnMpesa.setOnClickListener {

            startActivity(Intent(this, ConclusionCabeleleira::class.java))

        }

        binding.btnEmola.setOnClickListener {

            startActivity(Intent(this, ConclusionCabeleleira::class.java))

        }

        binding.btnMkesh.setOnClickListener {
            startActivity(Intent(this, ConclusionCabeleleira::class.java))

        }

        binding.btnContamovel.setOnClickListener {
            startActivity(Intent(this, ConclusionCabeleleira::class.java))

        }
    }
}