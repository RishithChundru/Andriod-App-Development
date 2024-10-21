package com.sasank.myapplication

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private var isEnglish = true // Track current language

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set initial welcome message
        val welcomeTextView: TextView = findViewById(R.id.welcomeTextView)
        welcomeTextView.text = getString(R.string.hello)
    }

    // Method to change the language
    fun changeLanguage(view: View) {
        if (isEnglish) {
            setLocale("hi") // Switch to Hindi
        } else {
            setLocale("en") // Switch to English
        }
        isEnglish = !isEnglish // Toggle language
    }

    // Method to set the locale
    private fun setLocale(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)

        val config = Configuration()
        config.setLocale(locale)

        // Update the configuration
        resources.updateConfiguration(config, resources.displayMetrics)

        // Refresh the activity
        recreate()
    }
}