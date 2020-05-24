package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr11.*

class Kadr11Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr11)
    }

    var flag = false

    fun nextClick(view: View) {
        if (flag) COUNT ++

        val intentKadr12 = Intent(this, Kadr12Activity::class.java)
        startActivity(intentKadr12)
        this.finish()

    }

    fun backClick(view: View){
        val intentKadr10 = Intent(this, Kadr10Activity::class.java)
        startActivity(intentKadr10)
        this.finish()
    }

    fun btn1Click(view: View){
        ans111Btn.setImageResource(R.drawable.btn_11_1_chosen)
        ans112Btn.setImageResource(R.drawable.btn_11_2)
        ans113Btn.setImageResource(R.drawable.btn_11_3)
        flag = false
    }

    fun btn2Click(view: View){
        ans112Btn.setImageResource(R.drawable.btn_11_2_chosen)
        ans111Btn.setImageResource(R.drawable.btn_11_1)
        ans113Btn.setImageResource(R.drawable.btn_11_3)
        flag = false
    }

    fun btn3Click(view: View){
        ans113Btn.setImageResource(R.drawable.btn_11_3_chosen)
        ans111Btn.setImageResource(R.drawable.btn_11_1)
        ans112Btn.setImageResource(R.drawable.btn_11_2)
        flag = true
    }
}
