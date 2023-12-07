package com.ankitojha.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRead = findViewById<Button>(R.id.btnRead)
        val btnDark = findViewById<Button>(R.id.btnDark)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)
        val btnPageChange = findViewById<Button>(R.id.btnPageChange)

       btnRead.setOnClickListener{
           layout.setBackgroundResource(R.color.yellow)
       }

        btnDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }

        btnPageChange.setOnClickListener{
            val intent = Intent(this, LayoutTestActivity::class.java)
            startActivity(intent)
        }
    }
}