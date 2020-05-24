package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr18Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr18)
    }

    fun nextClick(view: View) {
        val intentKadr19 = Intent(this, Kadr19Activity::class.java)
        startActivity(intentKadr19)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr17 = Intent(this, Kadr17Activity::class.java)
        startActivity(intentKadr17)
        this.finish()
    }

}
