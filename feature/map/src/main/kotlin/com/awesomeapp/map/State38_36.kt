package com.awesomeapp.map

sealed class State38_36 {
    data object Loading : State38_36()
    data class Success(val data: String) : State38_36()
    data class Error(val message: String) : State38_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}