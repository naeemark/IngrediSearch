package com.raywenderlich.ingredisearch.repository

import com.raywenderlich.ingredisearch.model.Recipe

interface RecipeRepository {
    fun addFavorite(item: Recipe)
    fun removeFavorite(item: Recipe)
    fun getFavoriteRecipes(): List<Recipe>
    fun getRecipes(query: String, callback: RepositoryCallback<List<Recipe>>)
}