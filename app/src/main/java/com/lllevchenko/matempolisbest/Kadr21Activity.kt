package com.lllevchenko.matempolisbest

import android.content.Intent
import android.os.Bundle
import android.view.View

class Kadr21Activity : ShotActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr21)
        ACTID = 21
    }

    override fun onClick(view: View){
        when (view.id)
        {
            R.id.nextBtn ->    {
                val intentNext = Intent(this, if (COUNT == MAX_COUNT)
                {ACTIVITY_DICT[ACTID+1]!!::class.java} else {ACTIVITY_DICT[ACTID+2]!!::class.java})
                startActivity(intentNext)
                this.finish()}
            R.id.backBtn ->    {
                val intentBack = Intent(this, ACTIVITY_DICT[ACTID-1]!!::class.java)
                startActivity(intentBack)
                this.finish()}
        }
    }
    }
