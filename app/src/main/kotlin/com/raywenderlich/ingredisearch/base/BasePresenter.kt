package com.raywenderlich.ingredisearch.base


abstract class BasePresenter<V> {
    protected var view: V? = null

    fun attachView(view: V) {
        this.view = view
    }

    fun detachView() {
        this.view = null
    }
}