package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kadr19Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr19)
        ACTID = 19
    }

    fun onClick(view: View){
        when (view.id)
        {
            R.id.nextBtn ->    {
                val intentNext = Intent(this, ACTIVITY_DICT[ACTID+1]!!::class.java)
                startActivity(intentNext)
                this.finish()}
            R.id.backBtn ->    {
                val intentBack = Intent(this, ACTIVITY_DICT[ACTID-1]!!::class.java)
                startActivity(intentBack)
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
