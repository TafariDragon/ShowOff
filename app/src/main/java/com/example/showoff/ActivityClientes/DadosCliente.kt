package com.example.showoff.ActivityClientes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityDadosClienteBinding

class DadosCliente : AppCompatActivity() {
    private lateinit var binding:ActivityDadosClienteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDadosClienteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }
    }
}