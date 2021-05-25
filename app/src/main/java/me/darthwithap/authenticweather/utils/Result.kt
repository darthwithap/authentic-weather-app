package me.darthwithap.authenticweather.utils

sealed class Result<out R> {
    data class Success<T>(val data:T? = null): Result<T>()
    data class Error(val e: Exception): Result<Nothing>()
    object Loading: Result<Nothing>()

    override fun toString(): String {
        return when(this) {
            is Success<*> -> "Success [data=$data]"
            is Error -> "Error [error=${e.localizedMessage}]"
            is Loading -> "Loading"
        }
    }
}