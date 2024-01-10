package com.hexjay.todolist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hexjay.todolist.logic.manager.ActivityCollector

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeActivity(this)
    }
}