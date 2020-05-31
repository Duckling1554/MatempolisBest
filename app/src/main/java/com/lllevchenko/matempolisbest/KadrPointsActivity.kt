package com.lllevchenko.matempolisbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kadr_points.*

class KadrPointsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadr_points)
        textViewPoints.text = getResources().getString(R.string.textPoints, NICKNAME, COUNT, MAX_COUNT)
    }

    fun onClick(view: View){
        val actidMain = 0
        when (view.id)
        {
            R.id.imageButtonMain ->    {
                val intentNext = Intent(this, ACTIVITY_DICT[actidMain]!!::class.java)
                startActivity(intentNext)
                this.finish()}
        }
    }
}
