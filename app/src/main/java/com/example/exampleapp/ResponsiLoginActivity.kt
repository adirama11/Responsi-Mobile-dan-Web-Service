package com.example.exampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exampleapp.databinding.ActivityResponsiLoginBinding

class ResponsiLoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityResponsiLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResponsiLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val tampungEmail = binding.emailUser.text.toString().trim()
//        val tampungPass = binding.passwordUser.text.toString().trim()

        binding.btnInput.setOnClickListener {
            val tampungEmail = binding.EmailUser.text.toString().trim()
            val tampungPass = binding.PasswordUser.text.toString().trim()
            val intent = Intent(this, ActivityFragment::class.java)
            intent.putExtra("email", tampungEmail)
            intent.putExtra("password", tampungPass)
            startActivity(intent)
        }
    }
}