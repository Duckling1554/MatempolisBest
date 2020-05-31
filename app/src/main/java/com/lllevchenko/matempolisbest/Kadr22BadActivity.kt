package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr22BadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr22_bad)
        ACTID = 23
    }

    fun onClick(view: View){
        val actidLast = 24
        when (view.id)
        {
            R.id.nextBtn ->    {
                val intentNext = Intent(this, ACTIVITY_DICT[actidLast]!!::class.java)
                startActivity(intentNext)
                this.finish()}
        }
    }

    override fun onPause() {
        super.onPause()

        val saver = pref.edit()
        saver.putInt(APP_PREFERENCES_ACTID, ACTID)
        saver.apply()
    }
}
