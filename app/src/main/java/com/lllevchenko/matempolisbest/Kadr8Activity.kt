package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr08)
    }

    fun nextClick(view: View) {
        val intentKadr9 = Intent(this, Kadr9Activity::class.java)
        startActivity(intentKadr9)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr7 = Intent(this, Kadr7Activity::class.java)
        startActivity(intentKadr7)
        this.finish()
    }
}
