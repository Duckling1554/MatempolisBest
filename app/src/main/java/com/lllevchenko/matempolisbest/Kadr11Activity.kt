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
    var id = 0

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("btnId", id)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val btnId = savedInstanceState.getInt("btnId")
        when (btnId){
            1 -> onClick(ans111Btn)
            2 -> onClick(ans112Btn)
            3 -> onClick(ans113Btn)
            0 -> {}
        }
    }

    fun onClick(view: View){
        when (view.id)
        {
            R.id.ans111Btn ->    {ans111Btn.setImageResource(R.drawable.btn_11_1_chosen)
                ans112Btn.setImageResource(R.drawable.btn_11_2)
                ans113Btn.setImageResource(R.drawable.btn_11_3)
                flag = false
                id = 1}
            R.id.ans112Btn ->    {ans111Btn.setImageResource(R.drawable.btn_11_1)
                ans112Btn.setImageResource(R.drawable.btn_11_2_chosen)
                ans113Btn.setImageResource(R.drawable.btn_11_3)
                flag = true
                id = 2}
            R.id.ans113Btn ->    {ans111Btn.setImageResource(R.drawable.btn_11_1)
                ans112Btn.setImageResource(R.drawable.btn_11_2)
                ans113Btn.setImageResource(R.drawable.btn_11_3_chosen)
                flag = false
                id = 3}
        }
    }


    fun nextClick(view: View) {
        val intentKadr12 = Intent(this, Kadr12Activity::class.java)
        val alert = ContinueDialog(intentKadr12, this)
        alert.show(getSupportFragmentManager(), "continue")
        if (flag) COUNT = 3

        val kadr11Id = 2
        if (flag) COUNTS[kadr11Id] = 1
    }

    fun backClick(view: View){
        val intentKadr10 = Intent(this, Kadr10Activity::class.java)
        startActivity(intentKadr10)
        this.finish()
    }
}
