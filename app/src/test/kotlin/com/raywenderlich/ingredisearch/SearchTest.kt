package com.raywenderlich.ingredisearch

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.never
import com.nhaarman.mockito_kotlin.verify
import com.raywenderlich.ingredisearch.presenter.SearchPresenter
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.ArgumentMatchers.anyString

class SearchTest {

    private lateinit var presenter: SearchPresenter
    private lateinit var view: SearchPresenter.View


    @Before
    fun setUp() {
        presenter = SearchPresenter()
        view = mock()
        presenter.attachView(view)
    }

    @Test
    fun search_withEmptyQuery_callsShowQueryRequiredMessage() {
        presenter.search("")

        verify(view).showQueryRequiredMessage()
    }

    @Test
    fun search_withEmptyQuery_doesNotCallsShowSearchResults() {
        presenter.search("")

        verify(view, never()).showSearchResults(anyString())
    }
}
