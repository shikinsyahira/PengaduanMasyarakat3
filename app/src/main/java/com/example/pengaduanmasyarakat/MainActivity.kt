package com.example.pengaduanmasyarakat

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    private lateinit var btnlogin : Button
    private lateinit var btnregister : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlogin = findViewById(R.id.btnlogin)
        btnlogin.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        btnregister = findViewById(R.id.btnregister)
        btnregister.setOnClickListener{
            startActivity(Intent(this, register::class.java))
        }

        val nikEditText: EditText = findViewById(R.id.nik)
        val password: EditText = findViewById(R.id.password)
        btnlogin.setOnClickListener {
            val nikEditText = nikEditText.text.toString()
            val password = password.text.toString()
            saveUsername(nikEditText)
            val BASE_URL = "https://shikinsyahira.000webhostapp.com/api-login.php"
            val url = "$BASE_URL?username=$nikEditText&password=$password"

            if (!(nikEditText.isEmpty() || password.isEmpty())) {

                val requestQueue = Volley.newRequestQueue(applicationContext)

                val stringRequest = StringRequest(
                    Request.Method.GET,
                    url,
                    Response.Listener { response ->
                        Log.d("Server Response", response)
                        if (response == "Selamat Datang") {
                            Toast.makeText(applicationContext, "Login Berhasil", Toast.LENGTH_SHORT)
                                .show()
                            startActivity(Intent(applicationContext, MainActivity::class.java))
                        } else {
                            Toast.makeText(applicationContext, "Login Gagal", Toast.LENGTH_SHORT)
                                .show()
                        }
                    },
                    Response.ErrorListener { error ->
                        Toast.makeText(applicationContext, error.toString(), Toast.LENGTH_SHORT)
                            .show()
                    }
                )
                requestQueue.add(stringRequest)
            } else {
                Toast.makeText(
                    applicationContext,
                    "Password Atau Username Salah",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }



    }
    private fun saveUsername(username: String) {
        val sharedPreferences: SharedPreferences = getSharedPreferences("Name", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("username", username)
        editor.apply()
    }
}