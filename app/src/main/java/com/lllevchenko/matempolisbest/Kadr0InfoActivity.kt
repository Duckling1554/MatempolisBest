package com.lllevchenko.matempolisbest

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.textservice.TextInfo
import kotlinx.android.synthetic.main.activity_kadr00_id.*
import kotlinx.android.synthetic.main.activity_kadr00_info.*

class Kadr0InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr00_info)
        textInfo.text = "Привет, $NICKNAME! \n " +
                "Скоро ты окажешься в удивительном городе Матемполисе. " +
                "Ты познакомишься с его жителями и отправишься вместе с ними в приключение. \n " +
                "Старайся и решай задачи правильно, потому что от твоих ответов зависит судьба Матемполиса! " +
                "Удачи!"
    }

    fun startClick(view: View) {
        val intentKadr1 = Intent(this, Kadr1Activity::class.java)
        startActivity(intentKadr1)
        this.finish()
    }


}
