package com.example.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
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
        val spinner1=findViewById<Spinner>(R.id.spinner)
        val spinnerList:List<String> = listOf("Apple","Orange","Kiwi","Grapes")
        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,spinnerList)
        spinner1.adapter=arrayAdapter
        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val select2 = spinnerList[position]
                Toast.makeText(this@MainActivity, select2, Toast.LENGTH_LONG).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?){
                TODO("Not Yet Implemented")
            }
        }

    }
}