package com.example.showoff.ActivitysCabeleleira

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityConclusionCabeleleiraBinding

class ConclusionCabeleleira : AppCompatActivity() {
    private  lateinit var binding: ActivityConclusionCabeleleiraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityConclusionCabeleleiraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnConculir.setOnClickListener {
            startActivity(Intent(this, Catalogo_Cabeleleira::class.java))
        }
    }
}