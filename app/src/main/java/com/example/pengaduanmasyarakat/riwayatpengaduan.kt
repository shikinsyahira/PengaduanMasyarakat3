package com.example.pengaduanmasyarakat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class riwayatpengaduan : AppCompatActivity() {
    private lateinit var btn1 : ImageButton
    private lateinit var btnditerima : ImageButton
    private lateinit var btnproses : ImageButton
    private lateinit var  btnselesai : ImageButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_pengaduan)

        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        btnditerima= findViewById(R.id.btnditerima)
        btnditerima.setOnClickListener {
            startActivity(Intent(this, diterima::class.java))
        }
        btnproses = findViewById(R.id.btnproses)
        btnproses.setOnClickListener {
            startActivity(Intent(this, diproses::class.java))
        }
        btnselesai = findViewById(R.id.btnselesai)
        btnselesai.setOnClickListener {
            startActivity(Intent(this, selesai::class.java))
        }
    }
}