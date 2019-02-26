package com.raywenderlich.ingredisearch.repository

interface RepositoryCallback<in T> {
    fun onSuccess(t: T?)
    fun onError()
}