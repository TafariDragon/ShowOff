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

        val nomeCliente = intent.getStringExtra("NomeCliente")
        val contactoCliente= intent.getStringExtra("contactoCliente")
        val valorCorte=intent.getStringExtra("ValorCorte")
        val nomeCorte=intent.getStringExtra("NomeCorte")
        val nomeBarbeiro= intent.getStringExtra("NomeBarbeiro")

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }

        var diaHoje = LocalDate.now()

        val textoExistente = binding.lblHorario.text.toString()
        val dataAtual = "$textoExistente \n$diaHoje"

        // Defina o texto atualizado no TextView
        binding.lblHorario.text = dataAtual


        binding.btn8.setOnClickListener {
            val horas="8h:30min"
            startActivity(Intent(this,Pagamento::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro)
                .putExtra("HorasMarcacao",horas)
                .putExtra("DataMarcacao",diaHoje))
        }

        binding.btn9.setOnClickListener {
            val horas="9h:30min"
            startActivity(Intent(this,Pagamento::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro)
                .putExtra("HorasMarcacao",horas)
                .putExtra("DataMarcacao",diaHoje))
        }

        binding.btn11.setOnClickListener {
            val horas="11h:30min"
            startActivity(Intent(this,Pagamento::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro)
                .putExtra("HorasMarcacao",horas)
                .putExtra("DataMarcacao",diaHoje))
        }

        binding.btn16.setOnClickListener {
            val horas="16h:30min"
            startActivity(Intent(this,Pagamento::class.java)
                .putExtra("contactoCliente",contactoCliente)
                .putExtra("NomeCliente",nomeCliente)
                .putExtra("ValorCorte",valorCorte)
                .putExtra("NomeCorte",nomeCorte)
                .putExtra("NomeBarbeiro",nomeBarbeiro)
                .putExtra("HorasMarcacao",horas)
                .putExtra("DataMarcacao",diaHoje))
        }




    }
}