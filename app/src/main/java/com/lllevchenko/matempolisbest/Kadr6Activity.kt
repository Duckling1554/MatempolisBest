package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr06.*

class Kadr6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr06)
    }
    var flag = false

    fun nextClick(view: View) {
        if (flag) COUNT ++

        val intentKadr7 = Intent(this, Kadr7Activity::class.java)
        startActivity(intentKadr7)
        this.finish()

    }

    fun backClick(view: View){
        val intentKadr5 = Intent(this, Kadr5Activity::class.java)
        startActivity(intentKadr5)
        this.finish()
    }

    fun btn1Click(view: View){
        ans61Btn.setImageResource(R.drawable.btn_6_1_chosen)
        ans62Btn.setImageResource(R.drawable.btn_6_2)
        ans63Btn.setImageResource(R.drawable.btn_6_3)
        flag = true
    }

    fun btn2Click(view: View){
        ans62Btn.setImageResource(R.drawable.btn_6_2_chosen)
        ans61Btn.setImageResource(R.drawable.btn_6_1)
        ans63Btn.setImageResource(R.drawable.btn_6_3)
        flag = false
    }

    fun btn3Click(view: View){
        ans63Btn.setImageResource(R.drawable.btn_6_3_chosen)
        ans61Btn.setImageResource(R.drawable.btn_6_1)
        ans62Btn.setImageResource(R.drawable.btn_6_2)
        flag = false
    }

}
