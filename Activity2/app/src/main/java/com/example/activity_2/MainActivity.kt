package com.example.activity_2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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


        val username=findViewById<EditText>(R.id.editTextText)
        val password=findViewById<EditText>(R.id.editTextText2)
        val btn=findViewById<Button>(R.id.button)

        /*btn.setOnClickListener{
            val a=username.text.toString()
            val b=password.text.toString()
            output.text="My username is "+ a +" and password is " +b
        }*/
        btn.setOnClickListener{
            if(username.text.toString()=="Rishith" && password.text.toString()=="Rishith"){
                Toast.makeText(this,"You are successfully logged In!!",Toast.LENGTH_SHORT).show()
                btn.text="Logged-In"
            }
            else{
                Toast.makeText(this,"Credentials mismatched",Toast.LENGTH_SHORT).show()
                btn.text="Unmatched credentials"
            }
        }
    }
}