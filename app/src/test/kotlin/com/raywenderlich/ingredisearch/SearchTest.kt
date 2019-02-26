package com.raywenderlich.ingredisearch

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.raywenderlich.ingredisearch.presenter.SearchPresenter
import org.junit.Test

import org.junit.Assert.*
class SearchTest {

    // 1
    @Test
    fun searchWithEmptyQueryCallsShowQueryRequiredMessage() {
        // 2
        val presenter = SearchPresenter()
        // 3
        val view: SearchPresenter.View = mock()
        presenter.attachView(view)

        // 4
        presenter.search("")

        // 5
        verify(view).showQueryRequiredMessage()
    }
}
