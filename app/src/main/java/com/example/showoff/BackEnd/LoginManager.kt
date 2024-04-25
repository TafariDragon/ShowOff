package com.example.showoff.BackEnd

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException

class LoginManager (private val context: Context) {

    interface LoginListener {
        fun onLoginSuccess(nomeCliente: String,contactoCliente:String)
        fun onUserNotExist()
        fun onLoginError(errorMessage: String)
    }

    fun fazerLogin(contacto: String, senha: String, listener: LoginListener) {
        val urlConsulta = "http://192.168.43.49/showoffAPI/consulta.php?Contacto_C=$contacto&Senha_C=$senha"

        val queue: RequestQueue = Volley.newRequestQueue(context)

        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, urlConsulta,
            null,
            Response.Listener { response ->
                try {
                    if (response.has("error")) {
                        val errorMessage = response.getString("error")
                        listener.onLoginError("Erro: $errorMessage")
                    } else {
                        if (response.has("cliente_existe")) {
                            val nomeCliente = response.getString("nome")
                            val contactoCliente = response.getString("contacto")
                            listener.onLoginSuccess(nomeCliente,contactoCliente)
                        } else {
                            listener.onUserNotExist()
                        }
                    }
                } catch (e: JSONException) {
                    listener.onLoginError("Erro ao processar a resposta do servidor")
                }
            },
            Response.ErrorListener { error ->
                listener.onLoginError("Erro: ${error.message}")
            }
        )

        queue.add(jsonObjectRequest)
    }
}


