package com.nelly.core.util.event

sealed class EventResult<out T> {

    data class Success<T>(val data: T) : EventResult<T>()

    data class Error<T>(val throwable: Throwable) : EventResult<T>()

    object Loading : EventResult<Nothing>()

    fun onSuccess(handler: (T) -> Unit): EventResult<T> = this.also {
        if (this is Success) handler(data)
    }

    fun onLoading(handler: () -> Unit): EventResult<T> = this.also {
        if (this is Loading) handler()
    }

    fun onError(handler: (t: Throwable) -> Unit): EventResult<T> = this.also {
        if (this is Error) handler(throwable)
    }

    fun onSuccessOrError(handler: () -> Unit): EventResult<T> = this.also {
        if (this is Success || this is Error) handler()
    }

}