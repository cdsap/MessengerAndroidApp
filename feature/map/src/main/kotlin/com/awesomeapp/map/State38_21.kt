package com.awesomeapp.map

sealed class State38_21 {
    data object Loading : State38_21()
    data class Success(val data: String) : State38_21()
    data class Error(val message: String) : State38_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}