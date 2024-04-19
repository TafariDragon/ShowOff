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

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnMpesa.setOnClickListener {

            startActivity(Intent(this,ConclusionBarbeiro::class.java))

        }

        binding.btnEmola.setOnClickListener {

            startActivity(Intent(this,ConclusionBarbeiro::class.java))

        }

        binding.btnMkesh.setOnClickListener {
            startActivity(Intent(this,ConclusionBarbeiro::class.java))

        }

        binding.btnContamovel.setOnClickListener {
            startActivity(Intent(this,ConclusionBarbeiro::class.java))

        }
    }
}