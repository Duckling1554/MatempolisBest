package com.lllevchenko.matempolisbest

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.*
import android.view.*

var COUNT = 0
var ACTID= ""
var NICKNAME = ""

val APP_PREFERENCES = "usersettings"
val APP_PREFERENCES_COUNTER = "counter"
val APP_PREFERENCES_ACTID = "present"

lateinit var pref: SharedPreferences

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pref = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE)
    }

    fun newGameClick(view: View) {
        COUNT = 0
        val intentKadrId = Intent(this, Kadr0IdActivity::class.java)
        startActivity(intentKadrId)
        this.finish()
    }

    fun loadGameClick(view: View) {
        COUNT = pref.getInt(APP_PREFERENCES_COUNTER, 0)






    }
}

