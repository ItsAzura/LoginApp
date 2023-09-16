package com.example.testapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val pass = findViewById<EditText>(R.id.editTextTextPassword)
        val btnEnter = findViewById<Button>(R.id.button)

        btnEnter.setOnClickListener {
            val emailValue = email.text.toString()
            Toast.makeText(this, "Welcome $emailValue", Toast.LENGTH_SHORT).show()
        }

    }
}


