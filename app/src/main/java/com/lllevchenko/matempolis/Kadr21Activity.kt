package com.lllevchenko.matempolis

import android.content.Intent
import android.os.Bundle
import android.view.View

class Kadr21Activity : ShotActivity(null, null) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr21)
        ACTID = 21
    }

    override fun onClick(view: View){

        val goodEnding = 22
        val badEnding = 23

        when (view.id)
        {
            R.id.nextBtn ->    {

                //проверка кол-ва очков у игрок, если их не меньше порогового значения, будет хорошая концовка
                val intentNext = Intent(this, if (COUNT >= MAX_COUNT)
                {ACTIVITY_DICT[goodEnding]!!::class.java} else {ACTIVITY_DICT[badEnding]!!::class.java})
                startActivity(intentNext)
                this.finish()}

            R.id.backBtn ->    {
                val intentBack = Intent(this, ACTIVITY_DICT[ACTID-1]!!::class.java)
                startActivity(intentBack)
                this.finish()}
        }
    }
    }
