package com.awesomeapp.forecast

sealed class State40_271 {
    data object Loading : State40_271()
    data class Success(val data: String) : State40_271()
    data class Error(val message: String) : State40_271()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}