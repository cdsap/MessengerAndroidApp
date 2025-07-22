package com.awesomeapp.contactcontact

sealed class State51_25 {
    data object Loading : State51_25()
    data class Success(val data: String) : State51_25()
    data class Error(val message: String) : State51_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}