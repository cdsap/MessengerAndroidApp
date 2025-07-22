package com.awesomeapp.usercontact

sealed class State56_53 {
    data object Loading : State56_53()
    data class Success(val data: String) : State56_53()
    data class Error(val message: String) : State56_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}