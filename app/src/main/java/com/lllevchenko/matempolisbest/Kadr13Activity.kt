package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr13.*

class Kadr13Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr13)
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
        }
    }


    fun nextClick(view: View) {
        val intentKadr14 = Intent(this, Kadr14Activity::class.java)
        val alert = ContinueDialog(intentKadr14, this)
        alert.show(getSupportFragmentManager(), "continue")
        if (flag) COUNT = 4

        val kadr13Id = 3
        if (flag) COUNTS[kadr13Id] = 1
    }

    fun backClick(view: View){
        val intentKadr12 = Intent(this, Kadr12Activity::class.java)
        startActivity(intentKadr12)
        this.finish()
    }
}
