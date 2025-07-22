package com.awesomeapp.metric

sealed class State27_34 {
    data object Loading : State27_34()
    data class Success(val data: String) : State27_34()
    data class Error(val message: String) : State27_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}