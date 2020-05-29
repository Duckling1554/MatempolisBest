package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kadr16.*

class Kadr16Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr16)
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
            1 -> onClick(ans161Btn)
            2 -> onClick(ans162Btn)
            3 -> onClick(ans163Btn)
            0 -> {}
        }
    }

    fun onClick(view: View){
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

    fun nextClick(view: View) {
        val intentKadr17 = Intent(this, Kadr17Activity::class.java)
        val alert = ContinueDialog(intentKadr17, this, flag)
        alert.show(getSupportFragmentManager(), "continue")
    }

    fun backClick(view: View){
        val intentKadr15 = Intent(this, Kadr15Activity::class.java)
        startActivity(intentKadr15)
        this.finish()
    }
}
