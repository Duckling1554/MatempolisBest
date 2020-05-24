package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr05)
    }

    fun nextClick(view: View) {
        val intentKadr6 = Intent(this, Kadr6Activity::class.java)
        startActivity(intentKadr6)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr4 = Intent(this, Kadr4Activity::class.java)
        startActivity(intentKadr4)
        this.finish()
    }
}
