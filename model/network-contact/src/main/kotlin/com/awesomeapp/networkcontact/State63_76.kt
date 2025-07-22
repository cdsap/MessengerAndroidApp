package com.awesomeapp.networkcontact

sealed class State63_76 {
    data object Loading : State63_76()
    data class Success(val data: String) : State63_76()
    data class Error(val message: String) : State63_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}