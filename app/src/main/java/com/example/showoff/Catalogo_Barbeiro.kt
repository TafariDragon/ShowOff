package com.example.showoff

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityCatalogoBarbeiroBinding

class Catalogo_Barbeiro : AppCompatActivity() {
    private lateinit var  binding: ActivityCatalogoBarbeiroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatalogoBarbeiroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            startActivity(Intent(this,MenuPrincipal::class.java))
            finish()
        }
    }
}