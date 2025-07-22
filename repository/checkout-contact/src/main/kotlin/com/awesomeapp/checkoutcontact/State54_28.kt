package com.awesomeapp.checkoutcontact

sealed class State54_28 {
    data object Loading : State54_28()
    data class Success(val data: String) : State54_28()
    data class Error(val message: String) : State54_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}