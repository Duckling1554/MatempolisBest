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

    fun nextClick(view: View) {
        if (flag) COUNT ++

        val intentKadr14 = Intent(this, Kadr14Activity::class.java)
        startActivity(intentKadr14)
        this.finish()

    }

    fun backClick(view: View){
        val intentKadr12 = Intent(this, Kadr12Activity::class.java)
        startActivity(intentKadr12)
        this.finish()
    }

    fun btn1Click(view: View){
        ans131Btn.setImageResource(R.drawable.btn_13_1_chosen)
        ans132Btn.setImageResource(R.drawable.btn_13_2)
        ans133Btn.setImageResource(R.drawable.btn_13_3)
        flag = false
    }

    fun btn2Click(view: View){
        ans132Btn.setImageResource(R.drawable.btn_13_2_chosen)
        ans131Btn.setImageResource(R.drawable.btn_13_1)
        ans133Btn.setImageResource(R.drawable.btn_13_3)
        flag = true
    }

    fun btn3Click(view: View){
        ans133Btn.setImageResource(R.drawable.btn_13_3_chosen)
        ans131Btn.setImageResource(R.drawable.btn_13_1)
        ans132Btn.setImageResource(R.drawable.btn_13_2)
        flag = false
    }
}
