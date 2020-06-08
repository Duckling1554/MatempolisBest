package com.lllevchenko.matempolis

import android.os.Bundle

class Kadr2Activity : ShotActivity(1, 3) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr02)
        ACTID = 2
    }
}
