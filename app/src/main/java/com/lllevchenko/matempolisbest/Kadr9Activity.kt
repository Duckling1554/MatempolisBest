package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr9Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr09)
    }

    fun nextClick(view: View) {
        val intentKadr10 = Intent(this, Kadr10Activity::class.java)
        startActivity(intentKadr10)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr8 = Intent(this, Kadr8Activity::class.java)
        startActivity(intentKadr8)
        this.finish()
    }
}
