package com.lllevchenko.matempolisbest

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr16.*

class Kadr16Activity : ShotActivity(15, 17) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr16)
        ACTID = 16
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
            1 -> onAnsClick(ans161Btn)
            2 -> onAnsClick(ans162Btn)
            3 -> onAnsClick(ans163Btn)
            0 -> {}
        }
    }

    fun onAnsClick(view: View){
        when (view.id)
        {
            R.id.ans161Btn ->    {ans161Btn.setImageResource(R.drawable.btn_16_1_chosen)
                ans162Btn.setImageResource(R.drawable.btn_16_2)
                ans163Btn.setImageResource(R.drawable.btn_16_3)
                flag = true
                id = 1}
            R.id.ans162Btn ->    {ans161Btn.setImageResource(R.drawable.btn_16_1)
                ans162Btn.setImageResource(R.drawable.btn_16_2_chosen)
                ans163Btn.setImageResource(R.drawable.btn_16_3)
                flag = false
                id = 2}
            R.id.ans163Btn ->    {ans161Btn.setImageResource(R.drawable.btn_16_1)
                ans162Btn.setImageResource(R.drawable.btn_16_2)
                ans163Btn.setImageResource(R.drawable.btn_16_3_chosen)
                flag = false
                id = 3}
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.nextBtn -> {
                val intentNext = Intent(this, ACTIVITY_DICT[ACTID + 1]!!::class.java)
                val alert = ContinueDialog(intentNext, this, flag)
                alert.show(getSupportFragmentManager(), "continue")
            }
            R.id.backBtn -> {
                val intentBack = Intent(this, ACTIVITY_DICT[ACTID - 1]!!::class.java)
                startActivity(intentBack)
                this.finish()
            }
        }
    }
}
