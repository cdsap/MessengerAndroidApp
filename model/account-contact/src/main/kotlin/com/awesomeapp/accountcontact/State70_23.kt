package com.awesomeapp.accountcontact

sealed class State70_23 {
    data object Loading : State70_23()
    data class Success(val data: String) : State70_23()
    data class Error(val message: String) : State70_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}