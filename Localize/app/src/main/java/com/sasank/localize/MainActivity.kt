package com.sasank.localize

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.intellij.lang.annotations.Language
import java.util.*

class MainActivity : AppCompatActivity() {

    // private var isEnglish = true // Track current language
    // changed from one language translator to vice versa translator. previously only translated into one language, not vice versa. commented codes are the part of the previous version
    // changed
    private lateinit var welcomeTextView: TextView
    private val pref_name="app_pref"
    private val language_key="language_key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val savedLanguage=getSharedPreferences(pref_name, Context.MODE_PRIVATE)  // new version  // MODE_PRIVATE is used to use the language in this app only, not in any other app
            .getString(language_key,"en")  // new version  // setting the actual language to English
        setLocale(savedLanguage!!)  // the one which is saved in the Bundle previously is going to be displayed
        setContentView(R.layout.activity_main)
        // Set initial welcome message
        val welcomeTextView: TextView = findViewById(R.id.welcomeTextView)
        welcomeTextView.text = getString(R.string.welcome_message)
    }

    // Method to change the language
    fun changeLanguage(view: View) {
//        if (isEnglish) {
//            setLocale("es") // Switch to Spanish
//        } else {
//            setLocale("en") // Switch to English
//        }
//        isEnglish = !isEnglish // Toggle language

        // new version
        val newLanguage=if(Locale.getDefault().language=="en") "es" else "en"   // if english then spanish else english
        getSharedPreferences(pref_name,Context.MODE_PRIVATE)
            .edit()
            .putString(language_key,newLanguage)
            .apply()
        setLocale(newLanguage)
        recreate()
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
        //recreate()  // this will keep on refreshing the appp
    }
}
