package com.example.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class ResponsiFragmenActivity : AppCompatActivity() {
    private lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi_fragmen)
        //Inisialisasi
        bottomNav = findViewById(R.id.bottomNavigation)

        //call function
        replaceFragment(UserFragment())

        //bottomNavigation
        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.fragmentUser -> replaceFragment(UserFragment())
                R.id.fragmentList -> replaceFragment(ListFragment())

                else ->{

                }
            }
            true
        }




    }
    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}