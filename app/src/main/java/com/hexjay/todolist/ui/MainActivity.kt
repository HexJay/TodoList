package com.hexjay.todolist.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log
import com.hexjay.todolist.databinding.ActivityMainBinding
import com.hexjay.todolist.utils.HeLog
import com.hexjay.todolist.utils.isDarkTheme
import kotlin.concurrent.thread

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        HeLog.d(isDarkTheme())
    }
    val handler = object: Handler(Looper.getMainLooper()){
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            when(msg.what){
            }
        }
    }
}