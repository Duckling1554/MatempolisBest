package com.lllevchenko.matempolisbest

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kadr_points.*

class KadrPointsActivity : ShotActivity(null, 0) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr_points)
        textViewPoints.text = getResources().getString(R.string.textPoints, NICKNAME, COUNT, MAX_COUNT)
    }
}
