package com.lllevchenko.matempolisbest

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.textservice.TextInfo
import kotlinx.android.synthetic.main.activity_kadr00_info.*

class Kadr0InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr00_info)
    }

    fun startClick(view: View) {
        val intentKadr1 = Intent(this, Kadr1Activity::class.java)
        startActivity(intentKadr1)
        this.finish()
    }


}