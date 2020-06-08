package com.lllevchenko.matempolis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr00_info.*

class Kadr0InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr00_info)
        textViewInfo.text = getResources().getString(R.string.textInfo, NICKNAME)
}

    fun startClick(view: View) {
        val intentKadr1 = Intent(this, Kadr1Activity::class.java)
        startActivity(intentKadr1)
        this.finish()
    }
}
