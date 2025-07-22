package com.awesomeapp.task

sealed class State28_53 {
    data object Loading : State28_53()
    data class Success(val data: String) : State28_53()
    data class Error(val message: String) : State28_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}