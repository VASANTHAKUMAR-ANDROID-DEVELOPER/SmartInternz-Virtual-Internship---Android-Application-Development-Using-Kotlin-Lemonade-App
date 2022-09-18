package com.example.lemonade

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         var count=0

         var text1=findViewById<TextView>(R.id.textView4)

        val lemon = findViewById<ImageView>(R.id.lemon)
        lemon.setOnClickListener {
            count++
            val intent = Intent(this, Lemon1::class.java)
            startActivity(intent)

        }

    }

}