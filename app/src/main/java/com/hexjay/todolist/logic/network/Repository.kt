package com.hexjay.todolist.logic.network

import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext
import kotlin.Result
object Repository {
    fun getAI(query: String) = fire(Dispatchers.IO) {
        val AIResponse = AppNetwork.getAI(query)
        if (AIResponse.status == "ok") {
            val ai = AIResponse.status
            Result.success(ai)
        } else {
            Result.failure(RuntimeException("response status is ${AIResponse.status}"))
        }
    }

    //统一进行try-catch处理
    private fun <T> fire(context: CoroutineContext, block: suspend () -> Result<T>) =
        liveData<Result<T>> {
            val result = try {
                block()
            } catch (e: Exception) {
                Result.failure<T>(e)
            }
            emit(result)
        }
}