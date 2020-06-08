package com.lllevchenko.matempolisbest

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

open class ShotActivity(prevKadrId:Int?, nextKadrId:Int?): AppCompatActivity() {

    val prevKadr = prevKadrId
    val nextKadr = nextKadrId

    override fun onPause() {
        super.onPause()

        val saver = pref.edit()
        saver.putInt(APP_PREFERENCES_ACTID, ACTID)
        saver.apply()
    }


    open fun onClick(view: View){
        when (view.id)
        {
            R.id.nextBtn ->    {
                val intentNext = Intent(this, ACTIVITY_DICT[nextKadr]!!::class.java)
                startActivity(intentNext)
                this.finish()}
            R.id.backBtn ->    {
                val intentBack = Intent(this, ACTIVITY_DICT[prevKadr]!!::class.java)
                startActivity(intentBack)
                this.finish()}
        }
    }
}