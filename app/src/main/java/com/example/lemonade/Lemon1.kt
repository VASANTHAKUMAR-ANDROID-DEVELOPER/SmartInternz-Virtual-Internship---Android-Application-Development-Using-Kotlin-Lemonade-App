package com.example.lemonade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Lemon1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lemon1)
        var lemo=findViewById<ImageView>(R.id.lemonhalf)
        lemo.setOnClickListener{
            var intent= Intent(this,Juice::class.java)
            startActivity(intent)
        }
    }
}