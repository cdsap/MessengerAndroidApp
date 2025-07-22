package com.awesomeapp.analytics

sealed class State23_21 {
    data object Loading : State23_21()
    data class Success(val data: String) : State23_21()
    data class Error(val message: String) : State23_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}