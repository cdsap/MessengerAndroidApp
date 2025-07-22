package com.awesomeapp.map

sealed class State38_72 {
    data object Loading : State38_72()
    data class Success(val data: String) : State38_72()
    data class Error(val message: String) : State38_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}