package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr22BadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr22_bad)
    }

    fun nextClick(view: View){
        val intentKadr0 = Intent(this, MainActivity::class.java)
        startActivity(intentKadr0)
        this.finish()
    }
}
