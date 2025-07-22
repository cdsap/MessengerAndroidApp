package com.awesomeapp.event

sealed class State30_30 {
    data object Loading : State30_30()
    data class Success(val data: String) : State30_30()
    data class Error(val message: String) : State30_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}