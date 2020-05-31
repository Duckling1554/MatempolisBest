package com.lllevchenko.matempolisbest

import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import java.security.AccessController.getContext

public fun onClick(view: View){
    val context = ACTIVITY_DICT[ACTID]
    val toast = Toast.makeText(context, ACTID.toString(), Toast.LENGTH_LONG)
    toast.show()
    when (view.id)
    {
        R.id.nextBtn ->    {
            val intentNext = Intent(context, ACTIVITY_DICT[ACTID+1]!!::class.java)
            context?.startActivity(intentNext)
            context?.finish()}
        R.id.backBtn ->    {
            val intentBack = Intent(context, ACTIVITY_DICT[ACTID-1]!!::class.java)
            context?.startActivity(intentBack)
            context?.finish()}
    }
}