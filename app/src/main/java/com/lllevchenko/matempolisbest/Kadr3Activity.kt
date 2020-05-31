package com.lllevchenko.matempolisbest

import android.content.Intent
import android.media.session.PlaybackState
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kadr03.*

class Kadr3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr03)
        ACTID = 3
    }

    var flag = false
    var id = 0

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("btnId", id)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val btnId = savedInstanceState.getInt("btnId")
        when (btnId){
            1 -> onClick(ans31Btn)
            2 -> onClick(ans32Btn)
            3 -> onClick(ans33Btn)
            0 -> {}
        }
    }

    fun onClick(view: View){
        when (view.id)
        {
            R.id.ans31Btn ->    {ans31Btn.setImageResource(R.drawable.btn_3_1_chosen)
                ans32Btn.setImageResource(R.drawable.btn_3_2)
                ans33Btn.setImageResource(R.drawable.btn_3_3)
                flag = false
                id = 1}
            R.id.ans32Btn ->    {ans31Btn.setImageResource(R.drawable.btn_3_1)
                ans32Btn.setImageResource(R.drawable.btn_3_2_chosen)
                ans33Btn.setImageResource(R.drawable.btn_3_3)
                flag = true
                id = 2}
            R.id.ans33Btn ->    {ans31Btn.setImageResource(R.drawable.btn_3_1)
                ans32Btn.setImageResource(R.drawable.btn_3_2)
                ans33Btn.setImageResource(R.drawable.btn_3_3_chosen)
                flag = false
                id = 3}
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
        saver.putInt(APP_PREFERENCES_COUNTER, COUNT)
        saver.putInt(APP_PREFERENCES_ACTID, ACTID)
        saver.apply()
    }

}
