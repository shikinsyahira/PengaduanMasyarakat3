package com.example.pengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {
    private lateinit var btncreateaccount : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btncreateaccount = findViewById(R.id.btncreateaccount)
        btncreateaccount.setOnClickListener{
            startActivity(Intent(this, login::class.java ))
        }



    }
}