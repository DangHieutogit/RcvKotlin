package com.example.recyclerviewwithitemclicklistenerinkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BaeAdapter(private val baeList: ArrayList<Bae>): RecyclerView.Adapter<BaeAdapter.BaeViewHolder>(){


    class BaeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.image)
        val textView : TextView = itemView.findViewById(R.id.Tv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return BaeViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaeViewHolder, position: Int) {
        val bae = baeList[position]
        holder.imageView.setImageResource(bae.image)
        holder.textView.text = bae.name
    }

    override fun getItemCount(): Int {
        return baeList.size
    }

}