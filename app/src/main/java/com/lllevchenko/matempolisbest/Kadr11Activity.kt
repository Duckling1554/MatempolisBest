package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kadr11.*

class Kadr11Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr11)
        ACTID = 11
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
            1 -> onClick(ans111Btn)
            2 -> onClick(ans112Btn)
            3 -> onClick(ans113Btn)
            0 -> {}
        }
    }

    fun onClick(view: View){
        when (view.id)
        {
            R.id.ans111Btn ->    {ans111Btn.setImageResource(R.drawable.btn_11_1_chosen)
                ans112Btn.setImageResource(R.drawable.btn_11_2)
                ans113Btn.setImageResource(R.drawable.btn_11_3)
                flag = false
                id = 1}
            R.id.ans112Btn ->    {ans111Btn.setImageResource(R.drawable.btn_11_1)
                ans112Btn.setImageResource(R.drawable.btn_11_2_chosen)
                ans113Btn.setImageResource(R.drawable.btn_11_3)
                flag = false
                id = 2}
            R.id.ans113Btn ->    {ans111Btn.setImageResource(R.drawable.btn_11_1)
                ans112Btn.setImageResource(R.drawable.btn_11_2)
                ans113Btn.setImageResource(R.drawable.btn_11_3_chosen)
                flag = true
                id = 3}
            R.id.nextBtn ->    {
                val intentNext = Intent(this, ACTIVITY_DICT[ACTID+1]!!::class.java)
                val alert = ContinueDialog(intentNext, this, flag)
                alert.show(getSupportFragmentManager(), "continue")}
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
