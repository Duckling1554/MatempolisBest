package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.*
import android.view.*

var COUNT = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        COUNT = 0
    }

    fun newGameClick(view: View) {
        val intentKadrId = Intent(this, Kadr0IdActivity::class.java)
        startActivity(intentKadrId)
        this.finish()
    }
}

