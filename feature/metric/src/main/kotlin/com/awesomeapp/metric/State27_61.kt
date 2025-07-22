package com.awesomeapp.metric

sealed class State27_61 {
    data object Loading : State27_61()
    data class Success(val data: String) : State27_61()
    data class Error(val message: String) : State27_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}