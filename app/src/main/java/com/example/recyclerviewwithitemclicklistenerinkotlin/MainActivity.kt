package com.example.recyclerviewwithitemclicklistenerinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var baeList: ArrayList<Bae>
    private lateinit var baeAdapter: BaeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.Rcv_data)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        baeList = ArrayList()

        baeList.add(Bae(R.drawable.a,"Maiii iuu"))
        baeList.add(Bae(R.drawable.a,"Maiii iuu"))
        baeList.add(Bae(R.drawable.a,"Maiii iuu"))
        baeList.add(Bae(R.drawable.a,"Maiii iuu"))
        baeList.add(Bae(R.drawable.a,"Maiii iuu"))
        baeList.add(Bae(R.drawable.a,"Maiii iuu"))

        baeAdapter = BaeAdapter(baeList)
        recyclerView.adapter = baeAdapter
    }
}