package com.example.showoff.ActivitysMarcacao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.R
import com.example.showoff.databinding.ActivityBarbeiroBinding

class Barbeiro : AppCompatActivity() {
    private lateinit var  binding: ActivityBarbeiroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barbeiro)

        binding.iconBack.setOnClickListener {
            onBackPressed()
        }


    }
}