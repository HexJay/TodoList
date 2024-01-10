package com.hexjay.todolist.utils

import android.widget.Toast
import com.hexjay.todolist.configuration.TodoListApplication

fun String.showToast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(TodoListApplication.context, this, duration).show()
}

fun Int.showToast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(TodoListApplication.context, this, duration).show()
}