package com.raywenderlich.ingredisearch

data class RecipesContainer(val recipes: List<Recipe>)

data class Recipe(val recipeId: String,
                  val title: String,
                  val imageUrl: String,
                  val sourceUrl: String,
                  var isFavorited: Boolean)