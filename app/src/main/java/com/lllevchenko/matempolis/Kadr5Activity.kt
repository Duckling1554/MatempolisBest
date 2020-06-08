package com.lllevchenko.matempolis

import android.os.Bundle

class Kadr5Activity : ShotActivity(4, 6) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr05)
        ACTID = 5
    }
}
