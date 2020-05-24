package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr07)
    }

    fun nextClick(view: View) {
        val intentKadr8 = Intent(this, Kadr8Activity::class.java)
        startActivity(intentKadr8)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr6 = Intent(this, Kadr6Activity::class.java)
        startActivity(intentKadr6)
        this.finish()
    }
}
