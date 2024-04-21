package com.example.showoff.ActivitysCabeleleira

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityMarcacacao1CabeleleiraBinding

class Marcacacao1Cabeleleira : AppCompatActivity() {
    private lateinit var  binding: ActivityMarcacacao1CabeleleiraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMarcacacao1CabeleleiraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            startActivity(Intent(this, Catalogo_Cabeleleira::class.java));
        }

        binding.btnCabelo.setOnClickListener {
            startActivity(Intent(this,Cabeleleiras_Nivel::class.java))
        }


    }
}