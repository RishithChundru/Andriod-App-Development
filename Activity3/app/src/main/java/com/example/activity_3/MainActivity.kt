package com.example.activity_3

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a=findViewById<ImageButton>(R.id.imageButton2)
        var b=findViewById<ImageButton>(R.id.imageButton3)
        a.setOnClickListener{
            Toast.makeText(this,"button clicked",Toast.LENGTH_LONG).show()
        }
        b.setOnClickListener{
            Toast.makeText(this,"button clicked",Toast.LENGTH_LONG).show()
        }
    }
}