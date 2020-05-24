package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr02)
    }

    fun nextClick(view: View) {
        val intentKadr3 = Intent(this, Kadr3Activity::class.java)
        startActivity(intentKadr3)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr1 = Intent(this, Kadr1Activity::class.java)
        startActivity(intentKadr1)
        this.finish()
    }
}
