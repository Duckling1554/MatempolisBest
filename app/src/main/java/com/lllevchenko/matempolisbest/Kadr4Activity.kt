package com.lllevchenko.matempolisbest

import android.os.Bundle

class Kadr4Activity : ShotActivity(3, 5) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr04)
        ACTID = 4
    }
}
