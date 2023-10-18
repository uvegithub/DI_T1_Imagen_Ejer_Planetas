package com.example.di_t1_imagen_ejer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Planetas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planetas)
    val imageView = findViewById<ImageView>(R.id.imageView2)
    val imageView2 = findViewById<ImageView>(R.id.imageView3)
    val textView=findViewById<TextView>(R.id.textView)

    imageView.setOnClickListener {
        textView.text="Jupiter"
    }

    imageView2.setOnClickListener {
        textView.text = "Saturno"
    }
    }
}