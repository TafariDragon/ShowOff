package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.Catalogo_Barbeiro
import com.example.showoff.databinding.ActivityMarcacaoCorte1Binding

class MarcacaoCorte1 : AppCompatActivity() {
    private lateinit var  binding : ActivityMarcacaoCorte1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMarcacaoCorte1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            startActivity(Intent(this,Catalogo_Barbeiro::class.java))
        }

       binding.btnCabelo.setOnClickListener {
           startActivity(Intent(this,Barbeiro::class.java))
       }

    }
}