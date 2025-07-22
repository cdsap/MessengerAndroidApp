package com.awesomeapp.forecast

sealed class State40_151 {
    data object Loading : State40_151()
    data class Success(val data: String) : State40_151()
    data class Error(val message: String) : State40_151()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}