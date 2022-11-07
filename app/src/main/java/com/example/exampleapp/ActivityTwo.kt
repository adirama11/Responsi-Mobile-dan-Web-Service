package com.example.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityTwo : AppCompatActivity() {
    private lateinit var hasilText : TextView
    private lateinit var hasilText2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        hasilText = findViewById(R.id.resultText)
        hasilText2 = findViewById(R.id.resultText2)
        val result = intent.getStringExtra("nama")
        val result2 = intent.getStringExtra("nama2")
        hasilText.text = result
        hasilText2.text = result2


    }
}