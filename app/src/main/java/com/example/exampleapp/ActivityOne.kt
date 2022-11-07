package com.example.exampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class ActivityOne : AppCompatActivity() {
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        btn = findViewById(R.id.btnMove)

        btn.setOnClickListener {
            val intent = Intent(this@ActivityOne, ActivityTwo::class.java)
            intent.putExtra("nama", "Faiz Nazhir")
            intent.putExtra("nama2", "Faiz Nazhir")
            startActivity(intent)
        }


        val namaLengkap = "faiz"
        var namaSaya = "faiz"
    }

}