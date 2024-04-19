package com.example.showoff.ActivitysMarcacao

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityHorarioBinding
import java.time.LocalDate

class Horario : AppCompatActivity() {
    private lateinit var  binding: ActivityHorarioBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHorarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        var diaHoje = LocalDate.now()

        val textoExistente = binding.lblHorario.text.toString()
        val dataAtual = "$textoExistente \n$diaHoje"

        // Defina o texto atualizado no TextView
        binding.lblHorario.text = dataAtual


        binding.btn8.setOnClickListener {
            startActivity(Intent(this,Pagamento::class.java))
        }




    }
}