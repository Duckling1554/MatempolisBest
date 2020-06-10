package com.lllevchenko.matempolis
import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class NewGameDialog(newIntent: Intent, activity: Activity): DialogFragment() {

    val intent = newIntent

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(getActivity())
        return builder.setTitle("Начать новую игру?")
            .setMessage("Все сохраненные данные будут потеряны.")
            .setIcon(R.drawable.alert)
            .setPositiveButton("ОК", {
                    dialog, which -> COUNT = 0

                //обнуляет значения глобальных переменных
                ACTID = 0
                NICKNAME = ""
                val deleter = pref.edit()
                deleter.clear().commit() //очищает файл сохранения пользовательских настроек
                startActivity(intent)
                activity?.finish() //завершает текущую операцию
            })
            .setNegativeButton("Отмена", null)
            .create()
    }

}