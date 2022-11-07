package com.example.exampleapp

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterRecycler(val context : Context, val listData : ArrayList<dataRecycler>): RecyclerView.Adapter<adapterRecycler.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): adapterRecycler.MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.fetch_main, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: adapterRecycler.MyViewHolder, position: Int) {
        val currentItem = listData[position]

        holder.imagePhotoProfile.setImageResource(currentItem.photo_profile)
        holder.name.text = currentItem.name
        holder.nim.text = currentItem.nim
        holder.imageLogo.setImageResource(currentItem.logo)
        holder.email.text = currentItem.email
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val imagePhotoProfile : ImageView = itemView.findViewById(R.id.photoProfile)
        val name : TextView = itemView.findViewById(R.id.textName)
        val nim : TextView = itemView.findViewById(R.id.textNim)
        val email : TextView = itemView.findViewById(R.id.textEmail)
        val imageLogo : ImageView = itemView.findViewById(R.id.logoUTY)
    }

}