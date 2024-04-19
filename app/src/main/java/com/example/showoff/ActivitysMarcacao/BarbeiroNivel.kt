package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityBarbeiroNivelBinding

class BarbeiroNivel : AppCompatActivity() {
    private  lateinit var  binding:ActivityBarbeiroNivelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBarbeiroNivelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnJose.setOnClickListener {
            startActivity(Intent(this,Horario::class.java))
        }
    }
}