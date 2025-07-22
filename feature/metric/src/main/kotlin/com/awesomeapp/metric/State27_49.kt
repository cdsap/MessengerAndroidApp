package com.awesomeapp.metric

sealed class State27_49 {
    data object Loading : State27_49()
    data class Success(val data: String) : State27_49()
    data class Error(val message: String) : State27_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}