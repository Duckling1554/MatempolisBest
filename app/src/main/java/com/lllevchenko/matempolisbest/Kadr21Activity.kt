package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr21Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr21)
    }

    fun nextClick(view: View) {

        var intentKadr22: Intent

        if (COUNT < 5) intentKadr22 = Intent(this, Kadr22BadActivity::class.java)

        else intentKadr22 = Intent(this, Kadr22GoodActivity::class.java)

        startActivity(intentKadr22)
        this.finish()
    }

    fun backClick(view: View){
        val intentKadr20 = Intent(this, Kadr20Activity::class.java)
        startActivity(intentKadr20)
        this.finish()
    }

}
