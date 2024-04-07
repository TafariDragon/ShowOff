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

        binding.iconBack.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
            finish()
        }

        binding.btnBarbeiro.setOnClickListener{
            startActivity(Intent(this,Catalogo_Barbeiro::class.java))
            finish()

        }

        binding.btnCabeleleira.setOnClickListener{
            startActivity(Intent(this,Catalogo_Cabeleleira::class.java))
            finish()

        }


    }
}