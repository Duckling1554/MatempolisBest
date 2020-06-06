package com.lllevchenko.matempolisbest

import android.os.Bundle

class Kadr1Activity : ShotActivity(null, 2) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr01)
        ACTID = 1
    }
}
