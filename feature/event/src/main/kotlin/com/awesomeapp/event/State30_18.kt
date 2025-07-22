package com.awesomeapp.event

sealed class State30_18 {
    data object Loading : State30_18()
    data class Success(val data: String) : State30_18()
    data class Error(val message: String) : State30_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}