package com.example.showoff

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.ActivitysCabeleleira.Catalogo_Cabeleleira
import com.example.showoff.databinding.ActivityMenuPrincipalBinding

class MenuPrincipal : AppCompatActivity() {
    private  lateinit var binding: ActivityMenuPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val idCliente = intent.getStringExtra("idCliente")
        val nomeCliente = intent.getStringExtra("NomeCliente")
        val contactoCliente= intent.getStringExtra("contactoCliente")
        val apelidoCliente= intent.getStringExtra("apelidoCliente")
        val senhaCliente= intent.getStringExtra("senhaCliente")
        binding.iconBack.setOnClickListener {
            onBackPressed()
            finish()
        }

        binding.btnBarbeiro.setOnClickListener{
            startActivity(Intent(this@MenuPrincipal,Catalogo_Barbeiro::class.java)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("apelidoCliente",apelidoCliente)
                .putExtra("senhaCliente",senhaCliente)
                .putExtra("idCliente",idCliente))

            finish()

        }

        binding.btnCabeleleira.setOnClickListener{
            startActivity(Intent(this@MenuPrincipal,Catalogo_Cabeleleira::class.java).putExtra("NomeCliente",nomeCliente))
            finish()

        }


    }
}