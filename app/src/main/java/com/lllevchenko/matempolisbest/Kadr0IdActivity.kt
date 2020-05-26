package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr0IdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr00_id)
    }

    fun readyClick(view: View) {
        val intentKadrInfo = Intent(this, Kadr0InfoActivity::class.java)
        startActivity(intentKadrInfo)
        this.finish()
    }
}
