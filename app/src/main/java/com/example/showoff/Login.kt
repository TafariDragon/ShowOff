package com.example.showoff

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.example.showoff.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private  lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun hideKeyboard(view: View, event: MotionEvent) {
            if (event.action == MotionEvent.ACTION_DOWN) {
                val imm = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }
        }

        binding.btnCadastrar.setOnClickListener {
            startActivity(Intent(this,CreateAccount::class.java))
            finish()
        }

        binding.btnEntrar.setOnClickListener {
            startActivity(Intent(this,MenuPrincipal::class.java))
            finish()

        }
    }
}