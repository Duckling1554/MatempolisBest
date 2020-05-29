package com.lllevchenko.matempolisbest

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.*
import android.view.*

var COUNT = 0

val COUNTS = arrayListOf(0, 0, 0, 0, 0)

var NICKNAME = ""

val APP_PREFERENCES = "usersettings"
val APP_PREFERENCES_COUNTER = "counter"
lateinit var pref: SharedPreferences

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pref = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE)
        COUNT = 0
    }

    fun newGameClick(view: View) {
        val intentKadrId = Intent(this, Kadr0IdActivity::class.java)
        startActivity(intentKadrId)
        this.finish()
    }
}

