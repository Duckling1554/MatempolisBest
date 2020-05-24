package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr16.*

class Kadr16Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr16)
    }

    var flag = false

    fun nextClick(view: View) {
        if (flag) COUNT ++

        val intentKadr17 = Intent(this, Kadr17Activity::class.java)
        startActivity(intentKadr17)
        this.finish()

    }

    fun backClick(view: View){
        val intentKadr15 = Intent(this, Kadr15Activity::class.java)
        startActivity(intentKadr15)
        this.finish()
    }

    fun btn1Click(view: View){
        ans161Btn.setImageResource(R.drawable.btn_16_1_chosen)
        ans162Btn.setImageResource(R.drawable.btn_16_2)
        ans163Btn.setImageResource(R.drawable.btn_16_3)
        flag = true
    }

    fun btn2Click(view: View){
        ans162Btn.setImageResource(R.drawable.btn_16_2_chosen)
        ans161Btn.setImageResource(R.drawable.btn_16_1)
        ans163Btn.setImageResource(R.drawable.btn_16_3)
        flag = false
    }

    fun btn3Click(view: View){
        ans163Btn.setImageResource(R.drawable.btn_16_3_chosen)
        ans161Btn.setImageResource(R.drawable.btn_16_1)
        ans162Btn.setImageResource(R.drawable.btn_16_2)
        flag = false
    }
}
