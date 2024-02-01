package com.hexjay.todolist.logic.manager

import android.app.Activity
import kotlin.system.exitProcess

object ActivityCollector {

    private val activities = ArrayList<Activity>()
    fun addActivity(activity: Activity){
        activities.add(activity)
    }

    fun removeActivity(activity: Activity){
        activities.remove(activity)
    }
    //关闭所有活动
    fun finishAll(){
        for (activity in activities){
            if (!activity.isFinishing){
                activity.finish()
            }
        }
        activities.clear()
        //结束进程
//        android.os.Process.killProcess(android.os.Process.myPid())
//        exitProcess(0)
    }
}