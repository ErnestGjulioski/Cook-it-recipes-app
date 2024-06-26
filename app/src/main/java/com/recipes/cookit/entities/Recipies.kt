package com.recipes.cookit.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Recipes")
data class Recipies(
          @PrimaryKey(autoGenerate = true)
    var id:Int
)


