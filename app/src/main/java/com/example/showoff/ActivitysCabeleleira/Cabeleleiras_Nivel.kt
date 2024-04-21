package com.example.showoff.ActivitysCabeleleira

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityCabeleleirasNivelBinding

class Cabeleleiras_Nivel : AppCompatActivity() {
    private  lateinit var binding: ActivityCabeleleirasNivelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCabeleleirasNivelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFelizBerta.setOnClickListener {
            startActivity(Intent(this,HorarioCabeleleira::class.java))

        }
    }
}