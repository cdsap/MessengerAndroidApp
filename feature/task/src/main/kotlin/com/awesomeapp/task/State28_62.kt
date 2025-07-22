package com.awesomeapp.task

sealed class State28_62 {
    data object Loading : State28_62()
    data class Success(val data: String) : State28_62()
    data class Error(val message: String) : State28_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}