package com.hexjay.todolist.logic.event

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class UpdateBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when(intent?.action){
            Intent.ACTION_BOOT_COMPLETED -> TODO()

        }
    }
}