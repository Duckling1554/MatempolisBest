package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr03.*

class Kadr3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr03)
    }

    var flag = false

    fun nextClick(view: View) {
        if (flag) COUNT ++

        val intentKadr4 = Intent(this, Kadr4Activity::class.java)
        startActivity(intentKadr4)
        this.finish()

    }

    fun backClick(view: View){
        val intentKadr2 = Intent(this, Kadr2Activity::class.java)
        startActivity(intentKadr2)
        this.finish()
    }

    fun twoClick(view: View){
        ans31Btn.setImageResource(R.drawable.btn_3_2_chosen)
        ans32Btn.setImageResource(R.drawable.btn_3_4)
        ans33Btn.setImageResource(R.drawable.btn_3_6)
        flag = false
    }

    fun fourClick(view: View){
        ans32Btn.setImageResource(R.drawable.btn_3_4_chosen)
        ans31Btn.setImageResource(R.drawable.btn_3_2)
        ans33Btn.setImageResource(R.drawable.btn_3_6)
        flag = true
    }

    fun sixClick(view: View){
        ans33Btn.setImageResource(R.drawable.btn_3_6_chosen)
        ans32Btn.setImageResource(R.drawable.btn_3_4)
        ans31Btn.setImageResource(R.drawable.btn_3_2)
        flag = false
    }
}
