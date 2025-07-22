package com.awesomeapp.note

sealed class State35_41 {
    data object Loading : State35_41()
    data class Success(val data: String) : State35_41()
    data class Error(val message: String) : State35_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}