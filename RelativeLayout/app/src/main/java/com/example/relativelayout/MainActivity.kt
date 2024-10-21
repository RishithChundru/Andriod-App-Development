package com.example.myapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.relativelayout.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        button1.setOnClickListener {
            Toast.makeText(this,"Button1 Clicked",Toast.LENGTH_SHORT).show();
            button1.text="button1 clicked"
        }

        button2.setOnClickListener {
            Toast.makeText(this,"Button2 Clicked",Toast.LENGTH_SHORT).show();
            button2.text="button2 clicked"
        }

        button3.setOnClickListener {
            Toast.makeText(this,"Button3 Clicked",Toast.LENGTH_SHORT).show();
            button3.text="button3 clicked"
        }

        button4.setOnClickListener {
            Toast.makeText(this,"Button4 Clicked",Toast.LENGTH_SHORT).show();
            button4.text="button4 clicked"
        }

        button5.setOnClickListener {
            Toast.makeText(this,"Button5 Clicked",Toast.LENGTH_SHORT).show();
            button5.text="button5 clicked"
        }

        button6.setOnClickListener {
            Toast.makeText(this,"Button6 Clicked",Toast.LENGTH_SHORT).show();
            button6.text="button6 clicked"
        }
    }
}
