package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr15Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr15)
    }

    fun nextClick(view: View) {
        val intentKadr16 = Intent(this, Kadr16Activity::class.java)
        startActivity(intentKadr16)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr14 = Intent(this, Kadr14Activity::class.java)
        startActivity(intentKadr14)
        this.finish()
    }
}
