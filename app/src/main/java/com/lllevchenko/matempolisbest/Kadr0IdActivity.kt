package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kadr00_id.*

class Kadr0IdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr00_id)
    }

    fun readyClick(view: View) {

        val nickname = nicknameText.text.toString().trim()

        if (nickname == ""){
            val toast = Toast.makeText(this, "Сначала введи имя!", Toast.LENGTH_SHORT)
            toast.show()
        }
        else
        {
            NICKNAME = nickname

            val intentKadrInfo = Intent(this, Kadr0InfoActivity::class.java)
            startActivity(intentKadrInfo)
            this.finish()
        }
    }

    override fun onPause() {
        super.onPause()

        val saver = pref.edit()
        saver.putInt(APP_PREFERENCES_ACTID, ACTID)
        saver.putString(APP_PREFERENCES_NICKNAME, NICKNAME)
        saver.apply()    }
}


