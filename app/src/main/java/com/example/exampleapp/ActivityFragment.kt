package com.example.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActivityFragment : AppCompatActivity() {
    private lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment2)
        //Inisialisasi
        bottomNav = findViewById(R.id.bottomNavigation)

        //call function
        replaceFragment(UserFragment())

        //bottomNavigation
        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.fragmentHome -> replaceFragment(ResponsiHomeFragment())
                R.id.fragmentPromo -> replaceFragment(ResponsiPromoFragment())
                R.id.fragmentMember -> replaceFragment(ResponsiMemberFragment())
                R.id.fragmentSetting -> replaceFragment(ResponsiSettingFragment())
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