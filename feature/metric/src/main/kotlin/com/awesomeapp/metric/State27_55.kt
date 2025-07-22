package com.awesomeapp.metric

sealed class State27_55 {
    data object Loading : State27_55()
    data class Success(val data: String) : State27_55()
    data class Error(val message: String) : State27_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}