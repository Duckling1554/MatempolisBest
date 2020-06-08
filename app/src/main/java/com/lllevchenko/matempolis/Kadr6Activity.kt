package com.lllevchenko.matempolis

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr06.*

class Kadr6Activity : ShotActivity(5, 7) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr06)
        ACTID = 6
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
            1 -> onAnsClick(ans61Btn)
            2 -> onAnsClick(ans62Btn)
            3 -> onAnsClick(ans63Btn)
            0 -> {}
        }
    }

    fun onAnsClick(view: View){
        when (view.id)
        {
            R.id.ans61Btn ->    {ans61Btn.setImageResource(R.drawable.btn_6_1_chosen)
                ans62Btn.setImageResource(R.drawable.btn_6_2)
                ans63Btn.setImageResource(R.drawable.btn_6_3)
                flag = true
                id = 1}
            R.id.ans62Btn ->    {ans61Btn.setImageResource(R.drawable.btn_6_1)
                ans62Btn.setImageResource(R.drawable.btn_6_2_chosen)
                ans63Btn.setImageResource(R.drawable.btn_6_3)
                flag = false
                id = 2}
            R.id.ans63Btn ->    {ans61Btn.setImageResource(R.drawable.btn_6_1)
                ans62Btn.setImageResource(R.drawable.btn_6_2)
                ans63Btn.setImageResource(R.drawable.btn_6_3_chosen)
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
