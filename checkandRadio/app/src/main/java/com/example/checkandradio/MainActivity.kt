package com.example.checkandradio

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a=findViewById<RadioGroup>(R.id.rg)
        var b=findViewById<TextView>(R.id.textView4)
        var c=findViewById<RadioButton>(R.id.radioButton)
        var d=findViewById<RadioButton>(R.id.radioButton2)
        var e=findViewById<RadioButton>(R.id.radioButton3)
        var f=findViewById<TextView>(R.id.textView3)
        val w=findViewById<CheckBox>(R.id.checkBox2)
        val x=findViewById<CheckBox>(R.id.checkBox3)
        val y=findViewById<CheckBox>(R.id.checkBox4)
        val z=findViewById<Button>(R.id.button)
        z.setOnClickListener{
            var g=a.checkedRadioButtonId
            var h=when(g){
                R.id.radioButton->"Medium"
                R.id.radioButton2->"Large"
                R.id.radioButton3->"small"
                else->""
            }
            var i= mutableListOf<String>()
            if (w.isChecked) i.add("cycle")
            if (x.isChecked) i.add("car")
            if (y.isChecked) i.add("bike")

            // Display selections
            b.text="Selected size: $h"
            f.text = "Selected option: $i"
            z.text = "Selected Options: ${i.joinToString(", ")}"
        }
    }
}