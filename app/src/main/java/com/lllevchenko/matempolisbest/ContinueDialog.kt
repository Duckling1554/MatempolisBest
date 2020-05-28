package com.lllevchenko.matempolisbest

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment

class ContinueDialog(newIntent: Intent, activity: Activity): DialogFragment() {

    val intent = newIntent
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(getActivity())
        return builder.setTitle("Продолжить?")
            .setMessage("Вернуться к этому заданию будет нельзя.")
            .setIcon(R.drawable.alert)
            .setPositiveButton("ОК", {
                dialog, which -> startActivity(intent)
                activity?.finish()
            })
            .setNegativeButton("Отмена", null)
            .create()
    }

}