package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr10Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr10)
    }

    fun nextClick(view: View) {
        val intentKadr11 = Intent(this, Kadr11Activity::class.java)
        startActivity(intentKadr11)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr9 = Intent(this, Kadr9Activity::class.java)
        startActivity(intentKadr9)
        this.finish()
    }
}
