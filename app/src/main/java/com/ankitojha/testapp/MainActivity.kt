package com.ankitojha.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLight = findViewById<Button>(R.id.btnLight)
        val btnDark = findViewById<Button>(R.id.btnDark)

        btnDark.setOnClickListener{
            Toast.makeText(applicationContext, "Uploading...", Toast.LENGTH_SHORT).show()
        }
    }
}