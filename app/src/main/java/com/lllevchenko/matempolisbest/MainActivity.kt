package com.lllevchenko.matempolisbest

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.*
import android.view.*
import android.widget.Toast

var COUNT = 0
val MAX_COUNT = 5
var ACTID = 0
var NICKNAME = ""

val ACTIVITY_DICT = mapOf(0 to MainActivity(),
                                                    1 to Kadr1Activity(),
                                                    2 to Kadr2Activity(),
                                                    3 to Kadr3Activity(),
                                                    4 to Kadr4Activity(),
                                                    5 to Kadr5Activity(),
                                                    6 to Kadr6Activity(),
                                                    7 to Kadr7Activity(),
                                                    8 to Kadr8Activity(),
                                                    9 to Kadr9Activity(),
                                                    10 to Kadr10Activity(),
                                                    11 to Kadr11Activity(),
                                                    12 to Kadr12Activity(),
                                                    13 to Kadr13Activity(),
                                                    14 to Kadr14Activity(),
                                                    15 to Kadr15Activity(),
                                                    16 to Kadr16Activity(),
                                                    17 to Kadr17Activity(),
                                                    18 to Kadr18Activity(),
                                                    19 to Kadr19Activity(),
                                                    20 to Kadr20Activity(),
                                                    21 to Kadr21Activity(),
                                                    22 to Kadr22GoodActivity(),
                                                    23 to Kadr22BadActivity(),
                                                    24 to KadrPointsActivity())

val APP_PREFERENCES = "usersettings"
val APP_PREFERENCES_COUNTER = "counter"
val APP_PREFERENCES_ACTID = "present"
val APP_PREFERENCES_NICKNAME = "nickname"

lateinit var pref: SharedPreferences

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pref = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE)
    }

    fun onClick(view: View){
        when (view.id)
        {
            R.id.newGameBtn ->    {
                val intentKadrId = Intent(this, Kadr0IdActivity::class.java)
                val alert = NewGameDialog(intentKadrId, this)
                alert.show(getSupportFragmentManager(), "continue")}

            R.id.loadGameBtn ->    {
                COUNT = pref.getInt(APP_PREFERENCES_COUNTER, 0)
                ACTID = pref.getInt(APP_PREFERENCES_ACTID, 0)
                NICKNAME = pref.getString(APP_PREFERENCES_NICKNAME, null).toString()

                if (ACTID == 0) {
                    val toast = Toast.makeText(this, "Нет сохранённой игры", Toast.LENGTH_SHORT)
                    toast.show()
                }
                else {
                    val intentCurrent = Intent(this, ACTIVITY_DICT[ACTID]!!::class.java)
                    startActivity(intentCurrent)
                    this.finish()
                }

                }
            }


        }
    }
