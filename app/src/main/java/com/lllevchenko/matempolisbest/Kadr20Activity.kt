package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr20Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr20)
    }

    fun nextClick(view: View) {
        val intentKadr21 = Intent(this, Kadr21Activity::class.java)
        startActivity(intentKadr21)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr19 = Intent(this, Kadr19Activity::class.java)
        startActivity(intentKadr19)
        this.finish()
    }
}
