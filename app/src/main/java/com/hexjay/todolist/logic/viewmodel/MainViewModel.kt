package com.hexjay.todolist.logic.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.hexjay.todolist.logic.network.Repository

class MainViewModel : ViewModel() {
    private val getAILiveData = MutableLiveData<String>()
    val aLiveData = getAILiveData.switchMap { query ->
        Repository.getAI(query)
    }

    private val _state1: MutableLiveData<String> = MutableLiveData()
    val state1 : LiveData<String> = _state1
}