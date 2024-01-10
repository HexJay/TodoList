package com.hexjay.todolist.configuration

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class TodoListApplication : Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "MyToken"
    }

    override fun onCreate() {
        super.onCreate()
        //获取Application的Context，全局只有一份实例，整个应用程序的生命周期内都不会被回收
        context = applicationContext
    }
}