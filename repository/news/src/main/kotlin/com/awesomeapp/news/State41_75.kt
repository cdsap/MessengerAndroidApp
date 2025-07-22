package com.awesomeapp.news

sealed class State41_75 {
    data object Loading : State41_75()
    data class Success(val data: String) : State41_75()
    data class Error(val message: String) : State41_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}