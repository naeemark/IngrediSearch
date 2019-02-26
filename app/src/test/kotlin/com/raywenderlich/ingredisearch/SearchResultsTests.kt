package com.raywenderlich.ingredisearch

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.eq
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.raywenderlich.ingredisearch.presenter.SearchResultsPresenter
import com.raywenderlich.ingredisearch.repository.RecipeRepository
import org.junit.Before
import org.junit.Test

class SearchResultsTests {

    private lateinit var repository: RecipeRepository
    private lateinit var presenter: SearchResultsPresenter
    private lateinit var view: SearchResultsPresenter.View

    @Before
    fun setUp() {

        repository = mock()
        view = mock()

        presenter = SearchResultsPresenter(repository)
        presenter.attachView(view)
    }


    @Test
    fun `search calls showLoading`(){

        val searchParam: String = "egg"

        presenter.search(searchParam)

        verify(view).showLoading()
    }

    @Test
    fun `search calls getRecipes`(){

        val searchParam: String = "egg"

        presenter.search(searchParam)

        verify(repository).getRecipes(eq(searchParam), any())
    }
}