package com.lllevchenko.matempolis

import android.os.Bundle

class Kadr9Activity : ShotActivity(8, 10) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr09)
        ACTID = 9
    }
}
