package com.example.caffeinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private lateinit var rvCofee: RecyclerView
    private var list: ArrayList<Coffee> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        rvCofee = findViewById(R.id.rv_coffee)
        rvCofee.setHasFixedSize(true)

        list.addAll(CoffeeData.ListData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvCofee.layoutManager = LinearLayoutManager(this)
        val CardViewCoffeeAdapter = CardViewCoffeeAdapter(list)
        rvCofee.adapter = CardViewCoffeeAdapter
    }
}