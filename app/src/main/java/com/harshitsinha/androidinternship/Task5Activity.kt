package com.harshitsinha.androidinternship

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class Task5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task5)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Task 5 - RecyclerView"
        val technologies = listOf(
            "Html",
            "Css",
            "JavaScript",
            "Flutter",
            "Python",
            "C",
            "C++"
        )
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = TechnologyAdapter(technologies)
        recyclerView.adapter = adapter
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}