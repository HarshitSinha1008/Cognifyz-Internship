package com.harshitsinha.androidinternship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        val btnTask1 = findViewById<Button>(R.id.btnTask1)
        btnTask1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val btnTask2 = findViewById<Button>(R.id.btnTask2)
        btnTask2.setOnClickListener {
            val intent = Intent(this, ButtonActivity::class.java)
            startActivity(intent)
        }
        val btnTask3 = findViewById<Button>(R.id.btnTask3)
        btnTask3.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
        val btnTask4 = findViewById<Button>(R.id.btnTask4)

        btnTask4.isEnabled = false
        val btnTask5 = findViewById<Button>(R.id.btnTask5)
        btnTask5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}