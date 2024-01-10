package com.hexjay.todolist.utils

import android.util.Log
import com.hexjay.todolist.BuildConfig

object HeLog {

    private var tag: String? = null
    private var className: String? = null
    private var line = 0
    private var methodName: String? = null

    private fun <T> createLog(log: T): String {
        val buffer = StringBuffer().apply {
            append("(")
            append(className)
            append(":")
            append(line)
            append(")")
            append(" >>>>> ")
            append(log)
        }
        return buffer.toString()
    }

    private fun getTag(sElements: Array<StackTraceElement>) {
        className = sElements[1].fileName
        tag = className
        methodName = " [" + sElements[1].methodName + "]"
        line = sElements[1].lineNumber
    }

    private fun isDebuggable(): Boolean {
        return BuildConfig.DEBUG
    }

    fun <T> e(message: T) {
        if (!isDebuggable()) return

        // Throwable instance must be created before any methods
        getTag(Throwable().stackTrace)
        Log.e(tag, createLog(message))
    }

    fun <T> i(message: T) {
        if (!isDebuggable()) return
        getTag(Throwable().stackTrace)
        Log.i(tag, createLog(message))
    }

    fun <T> d(message: T) {
        if (!isDebuggable()) return
        getTag(Throwable().stackTrace)
        Log.d(tag, createLog(message))
    }

    fun <T> v(message: T) {
        if (!isDebuggable()) return
        getTag(Throwable().stackTrace)
        Log.v(tag, createLog(message))
    }

    fun <T> w(message: T) {
        if (!isDebuggable()) return
        getTag(Throwable().stackTrace)
        Log.w(tag, createLog(message))
    }
}