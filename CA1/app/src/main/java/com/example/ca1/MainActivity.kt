package com.example.ca1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        val a=findViewById<EditText>(R.id.editTextText)
        val b=findViewById<EditText>(R.id.editTextText2)
        val c=findViewById<Button>(R.id.button)
        c.setOnClickListener{
            if(a.text.toString()=="Rishith" && b.text.toString()=="Rishith123"){
                Toast.makeText(this,"Welcome back", Toast.LENGTH_LONG).show()
                c.text="Welcome back"
            }
            else{
                Toast.makeText(this,"Invalid Credentials", Toast.LENGTH_LONG).show()
                c.text="Invalid Unmatched"
            }
        }
        }
    }
