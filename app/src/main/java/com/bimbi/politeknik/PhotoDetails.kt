package com.bimbi.politeknik

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PhotoDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_details)

        // Get the image resource ID from the Intent
        val imageResId = intent.getIntExtra("imageResId", -1)

        // Find the ImageView and set the image resource
        val imageView = findViewById<ImageView>(R.id.imageViewDetail)
        if (imageResId != -1) {
            imageView.setImageResource(imageResId)
        }
    }
}
