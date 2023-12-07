package com.ankitojha.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LayoutTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_test)

        val btnChange = findViewById<Button>(R.id.btnChange)
        val btnBlue = findViewById<Button>(R.id.btnBlue)
        val btnPink = findViewById<Button>(R.id.btnPink)
        val btnYellow = findViewById<Button>(R.id.btnYellow)
        val btnGreen = findViewById<Button>(R.id.btnGreen)
        val btnViolet = findViewById<Button>(R.id.btnViolet)

        btnChange.setOnClickListener {
            Toast.makeText(applicationContext, "Change pressed", Toast.LENGTH_SHORT).show()
        }
    }
}