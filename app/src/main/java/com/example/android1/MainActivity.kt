package com.example.android1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private var images = intArrayOf(R.drawable.k1,R.drawable.k2,R.drawable.k3,R.drawable.k4)
    private var CurrentImage = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val main = findViewById<LinearLayout>(R.id.root)
     val image = ImageView(this)

         main.addView(image)
        image.setImageResource(images[0])
        image.setOnClickListener {
            image.setImageResource(images[++CurrentImage % images.size])
        }
    }
}
