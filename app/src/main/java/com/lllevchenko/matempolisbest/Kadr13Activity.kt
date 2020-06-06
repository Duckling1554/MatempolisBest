package com.lllevchenko.matempolisbest

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr13.*

class Kadr13Activity : ShotActivity() {

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
            1 -> onAnsClick(ans131Btn)
            2 -> onAnsClick(ans132Btn)
            3 -> onAnsClick(ans133Btn)
            0 -> {}
        }
    }

    fun onAnsClick(view: View){
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
        }
    }
}
