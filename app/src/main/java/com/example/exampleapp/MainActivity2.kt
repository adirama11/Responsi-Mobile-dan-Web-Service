package com.example.exampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    private lateinit var buttonMove : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        buttonMove = findViewById(R.id.btnMove)

        buttonMove.setOnClickListener {
            val intent = Intent(this,PIndahActivity::class.java)
            intent.putExtra("data", "Ridho")
            startActivity(intent)
        }




    }
}