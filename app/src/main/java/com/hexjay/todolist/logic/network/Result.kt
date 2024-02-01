package com.hexjay.todolist.logic.network

sealed class Result {
    class Success(val msg: String) : Result()
    class Failure(val error: Exception) : Result()
}

