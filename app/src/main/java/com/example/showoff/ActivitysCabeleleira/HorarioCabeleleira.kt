package com.example.showoff.ActivitysCabeleleira

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityHorarioCabeleleiraBinding
import java.time.LocalDate

class HorarioCabeleleira : AppCompatActivity() {
    private lateinit var binding: ActivityHorarioCabeleleiraBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHorarioCabeleleiraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var dia = LocalDate.now()
        var texto_antigo= binding.lblHorario.text.toString()

        binding.lblHorario.setText("$texto_antigo \n$dia")

        binding.btn8.setOnClickListener {
            startActivity(Intent(this,PagamentosCabeleleira::class.java))
        }
    }
}