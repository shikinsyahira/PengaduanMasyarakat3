package com.example.pengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DashboardActivity : AppCompatActivity() {
    private lateinit var btnprofile : ImageView
    private lateinit var btnpengaduan : ImageView
    private lateinit var btnhistoris : ImageView
    private lateinit var btnkeluar : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnprofile = findViewById(R.id.btnprofile)
        btnprofile.setOnClickListener{
            startActivity(Intent(this, profil::class.java))
        }
        btnpengaduan = findViewById(R.id.btnpengaduan)
        btnpengaduan.setOnClickListener{
            startActivity(Intent(this,buatpengaduan::class.java))
        }

        btnhistoris = findViewById(R.id.btnhistoris)
        btnhistoris.setOnClickListener{
            startActivity(Intent(this, riwayatpengaduan::class.java))
        }

        btnkeluar = findViewById(R.id.btnkeluar)
        btnkeluar.setOnClickListener{
            startActivity(Intent(this, login::class.java))

        }
    }
}