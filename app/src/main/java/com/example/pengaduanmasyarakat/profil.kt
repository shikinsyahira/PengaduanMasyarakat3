package com.example.pengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class profil : AppCompatActivity() {
    private lateinit var btn1 : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}