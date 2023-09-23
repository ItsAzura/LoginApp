package com.example.testapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val name = intent.getStringExtra("NAME")
        val tvResult: TextView = findViewById(R.id.tvResult)
        val result = "Wellcome $name"
        tvResult.text = result
    }
}