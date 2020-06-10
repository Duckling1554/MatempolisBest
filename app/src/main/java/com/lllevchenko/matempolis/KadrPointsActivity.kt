package com.lllevchenko.matempolis

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kadr_points.*

class KadrPointsActivity : ShotActivity(null, 0) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr_points)

        textViewPoints.text = getResources().getString(R.string.textPoints, NICKNAME, COUNT, MAX_COUNT) //изменение текста на экране - добавление имени пользователя и кол-ва набранных баллов

        //добавление анимации на экран
        imageViewAnim.setImageResource(R.drawable.char_animation)
        val animation: AnimationDrawable = imageViewAnim.drawable as AnimationDrawable
        animation.start() //запуск анимации
    }
}
