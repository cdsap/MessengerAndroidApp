package com.awesomeapp.messagecontact

sealed class State67_57 {
    data object Loading : State67_57()
    data class Success(val data: String) : State67_57()
    data class Error(val message: String) : State67_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}