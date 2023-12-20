package com.example.pengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class diproses : AppCompatActivity() {
    private lateinit var btn1 : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diproses)

        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {
            startActivity(Intent(this, riwayatpengaduan::class.java))
        }


    }
}