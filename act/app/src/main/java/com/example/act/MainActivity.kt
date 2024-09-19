package com.example.act

import android.os.Bundle
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

    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(applicationContext, "onStart called", Toast.LENGTH_LONG)
        toast.show()
    }
    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(applicationContext, "onRestart called", Toast.LENGTH_LONG)
        toast.show()
    }
    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(applicationContext, "onPause called", Toast.LENGTH_LONG)
        toast.show()
    }
    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(applicationContext, "onResume called", Toast.LENGTH_LONG)
        toast.show()
    }
    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(applicationContext, "onStop called", Toast.LENGTH_LONG)
        toast.show()
    }
    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(applicationContext, "ondestroy called", Toast.LENGTH_LONG)
        toast.show()
    }

}