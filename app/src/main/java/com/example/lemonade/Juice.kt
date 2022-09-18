package com.example.lemonade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Juice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juice)
        var start=findViewById<ImageView>(R.id.imageView)
        start.setOnClickListener{
            val intent = Intent(this,StartAgain::class.java)
            startActivity(intent)
        }

    }
}