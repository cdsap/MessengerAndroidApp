package com.awesomeapp.commentcontact

sealed class State59_21 {
    data object Loading : State59_21()
    data class Success(val data: String) : State59_21()
    data class Error(val message: String) : State59_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}