package com.hexjay.todolist.utils

import android.widget.Toast
import com.hexjay.todolist.configuration.SysApplication

fun String.showToast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(SysApplication.context, this, duration).show()
}

fun Int.showToast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(SysApplication.context, this, duration).show()
}