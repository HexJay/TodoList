package com.hexjay.todolist.utils

import android.content.res.Configuration
import com.hexjay.todolist.configuration.SysApplication

fun isDarkTheme():Boolean{
    val flag = SysApplication.context.resources.configuration.uiMode and
            Configuration.UI_MODE_NIGHT_MASK
    return flag == Configuration.UI_MODE_NIGHT_YES
}