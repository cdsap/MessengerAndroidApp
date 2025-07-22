package com.awesomeapp.note

sealed class State35_53 {
    data object Loading : State35_53()
    data class Success(val data: String) : State35_53()
    data class Error(val message: String) : State35_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}