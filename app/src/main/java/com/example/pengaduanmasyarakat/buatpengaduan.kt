package com.example.pengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class buatpengaduan : AppCompatActivity() {
    private lateinit var btn1 : ImageButton
    private lateinit var btnkirim : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buat_pengaduan)

        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        btnkirim = findViewById(R.id.btnkirim)
        btnkirim.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}