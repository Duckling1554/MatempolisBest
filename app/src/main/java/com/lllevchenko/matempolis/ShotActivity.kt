package com.lllevchenko.matempolis

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

open class ShotActivity(prevKadrId:Int?, nextKadrId:Int?): AppCompatActivity() {

    //NULLABLE идентификаторы предыдущей и следующей Activity
    val prevKadr = prevKadrId
    val nextKadr = nextKadrId

    //Сохранение текущего ACTID
    override fun onPause() {
        super.onPause()

        val saver = pref.edit()
        saver.putInt(APP_PREFERENCES_ACTID, ACTID)
        saver.apply()
    }

    //Функция нажатия кнопок "далее" и "назад"
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