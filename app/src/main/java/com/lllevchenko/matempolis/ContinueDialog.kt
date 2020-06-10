package com.lllevchenko.matempolis

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class ContinueDialog(newIntent: Intent, activity: Activity, flag: Boolean): DialogFragment() {

    val intent = newIntent
    val flag = flag

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(getActivity())
        return builder.setTitle("Продолжить?")
            .setMessage("Вернуться к этому заданию будет нельзя.")
            .setIcon(R.drawable.alert)
            .setPositiveButton("ОК", {
                dialog, which -> startActivity(intent)
                if (flag) COUNT ++ //увеличивает значение COUNT, если ответ верный
                activity?.finish() //завершает текущую операцию
            })
            .setNegativeButton("Отмена", null)
            .create()
    }

}