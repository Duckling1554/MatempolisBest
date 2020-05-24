package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr19Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr19)
    }

    fun nextClick(view: View) {
        val intentKadr20 = Intent(this, Kadr20Activity::class.java)
        startActivity(intentKadr20)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr18 = Intent(this, Kadr18Activity::class.java)
        startActivity(intentKadr18)
        this.finish()
    }
}
