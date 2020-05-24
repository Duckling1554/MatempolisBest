package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Kadr12Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr12)
    }

    fun nextClick(view: View) {
        val intentKadr13 = Intent(this, Kadr13Activity::class.java)
        startActivity(intentKadr13)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr11 = Intent(this, Kadr11Activity::class.java)
        startActivity(intentKadr11)
        this.finish()
    }
}
