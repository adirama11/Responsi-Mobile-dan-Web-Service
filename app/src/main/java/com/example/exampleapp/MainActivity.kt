package com.example.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList : ArrayList<dataRecycler>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerView
        dataList = ArrayList<dataRecycler>()

        val nama = arrayOf(
            "Faiz Nazhir",
            "Amrulloh",
            "Nazhir",
            "Rizki",
            "ridho",
            "Roma"
        )
        val email = arrayOf(
            "faiznazhir@gmail.com",
            "faiznazhir1@gmail.com",
            "faiznazhir2@gmail.com",
            "faiznazhir3@gmail.com",
            "faiznazhir4@gmail.com",
            "faiznazhir5@gmail.com"
        )
        val image = arrayOf(
            R.drawable.example_image,
            R.drawable.waving_hand,
            R.drawable.rock,
            R.drawable.example_image,
            R.drawable.waving_hand,
            R.drawable.rock
        )
        val imageUTY = arrayOf(
            R.drawable.logo_uty,
            R.drawable.logo_uty,
            R.drawable.logo_uty,
            R.drawable.logo_uty,
            R.drawable.logo_uty,
            R.drawable.logo_uty,
        )

        val nim = arrayOf(
            "5299151515",
            "5299151522",
            "5299151555",
            "5299151511",
            "5299151514",
            "5299151514",
        )
        for( i in nama.indices){
            dataList.add(
                dataRecycler(
                    image[i],
                    nama[i],
                    nim[i],
                    email[i],
                    imageUTY[i]

                )
            )
        }
        populateData()

    }
    private fun populateData(){
        val layoutManager = LinearLayoutManager(this)
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true
        recyclerView.layoutManager = layoutManager
        val adp = adapterRecycler(this, dataList)
        recyclerView.adapter = adp
    }

}