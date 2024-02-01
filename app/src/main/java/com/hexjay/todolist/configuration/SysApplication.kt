package com.hexjay.todolist.configuration

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SysApplication : Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val AppID = "10288e1a"
        const val APISecret = "NGZmNDJkY2YwMmIwNDQ2Y2U4ZTkxZGI2"
        const val APIKey = "ad617bfa0fb3ea2a74342bff26561c87"
    }

    override fun onCreate() {
        super.onCreate()
        //获取Application的Context，全局只有一份实例，整个应用程序的生命周期内都不会被回收
        context = applicationContext
    }

}