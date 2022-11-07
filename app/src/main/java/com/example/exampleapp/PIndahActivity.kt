package com.example.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PIndahActivity : AppCompatActivity() {
    private lateinit var nama : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah)

        nama = findViewById(R.id.textNama)
        val tampungData = intent.getStringExtra("data").toString()
        nama.text = tampungData

    }
}