package com.example.relativelayout

import android.os.Bundle
import android.widget.Button
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
        var a=findViewById<Button>(R.id.button1)
        var b=findViewById<Button>(R.id.button2)
        var c=findViewById<Button>(R.id.button3)
        a.setOnClickListener{
            Toast.makeText(this,"Button1 is clicked",Toast.LENGTH_LONG).show()
        }
        b.setOnClickListener{
            Toast.makeText(this,"Button2 is clicked",Toast.LENGTH_LONG).show()
        }
        c.setOnClickListener{
            Toast.makeText(this,"Button3 is clicked",Toast.LENGTH_LONG).show()
        }
    }
}