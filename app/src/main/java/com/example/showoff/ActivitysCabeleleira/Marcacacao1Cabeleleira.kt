package com.example.showoff.ActivitysCabeleleira

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityMarcacaoCorte1Binding

class Marcacacao1Cabeleleira : AppCompatActivity() {
    private lateinit var  binding: ActivityMarcacaoCorte1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMarcacaoCorte1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            startActivity(Intent(this, Catalogo_Cabeleleira::class.java));
        }
    }
}