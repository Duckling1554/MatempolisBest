package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kadr13.*

class Kadr13Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr13)
        ACTID = 13
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
            1 -> onClick(ans131Btn)
            2 -> onClick(ans132Btn)
            3 -> onClick(ans133Btn)
            0 -> {}
        }
    }

    fun onClick(view: View){
        when (view.id)
        {
            R.id.ans131Btn ->    {ans131Btn.setImageResource(R.drawable.btn_13_1_chosen)
                ans132Btn.setImageResource(R.drawable.btn_13_2)
                ans133Btn.setImageResource(R.drawable.btn_13_3)
                flag = false
                id = 1}
            R.id.ans132Btn ->    {ans131Btn.setImageResource(R.drawable.btn_13_1)
                ans132Btn.setImageResource(R.drawable.btn_13_2_chosen)
                ans133Btn.setImageResource(R.drawable.btn_13_3)
                flag = true
                id = 2}
            R.id.ans133Btn ->    {ans131Btn.setImageResource(R.drawable.btn_13_1)
                ans132Btn.setImageResource(R.drawable.btn_13_2)
                ans133Btn.setImageResource(R.drawable.btn_13_3_chosen)
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
