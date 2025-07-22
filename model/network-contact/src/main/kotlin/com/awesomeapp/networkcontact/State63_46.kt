package com.awesomeapp.networkcontact

sealed class State63_46 {
    data object Loading : State63_46()
    data class Success(val data: String) : State63_46()
    data class Error(val message: String) : State63_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}