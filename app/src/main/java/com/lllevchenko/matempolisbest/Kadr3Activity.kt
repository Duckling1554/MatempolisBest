package com.lllevchenko.matempolisbest

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr03.*

class Kadr3Activity : ShotActivity() {

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
            1 -> onAnsClick(ans31Btn)
            2 -> onAnsClick(ans32Btn)
            3 -> onAnsClick(ans33Btn)
            0 -> {}
        }
    }

    fun onAnsClick(view: View){
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
        }
    }
}
