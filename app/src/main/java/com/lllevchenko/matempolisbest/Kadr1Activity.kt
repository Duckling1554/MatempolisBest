package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr01)
    }

    fun nextClick(view: View) {
        val intentKadr2 = Intent(this, Kadr2Activity::class.java)
        startActivity(intentKadr2)
        this.finish()
    }

}
