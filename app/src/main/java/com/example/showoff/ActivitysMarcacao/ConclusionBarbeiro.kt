package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.Catalogo_Barbeiro
import com.example.showoff.databinding.ActivityConclusionBarbeiroBinding

class ConclusionBarbeiro : AppCompatActivity() {
    private lateinit var  binding: ActivityConclusionBarbeiroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConclusionBarbeiroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnConculir.setOnClickListener {
            startActivity(Intent(this,Catalogo_Barbeiro::class.java))
        }
    }
}