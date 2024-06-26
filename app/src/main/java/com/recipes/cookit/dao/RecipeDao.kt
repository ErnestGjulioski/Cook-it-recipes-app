package com.recipes.cookit.dao

import androidx.room.Dao
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.recipes.cookit.entities.Recipies



@Dao
interface RecipeDao {

    @get:Query("SELECT*FROM recipes ORDER BY id DESC" )
    val allRecipes : List<Recipies>

    @insert(onConflict = OnConflictStrategy.REPLACE)

    fun insertRecipe(recipies: Recipies)
}