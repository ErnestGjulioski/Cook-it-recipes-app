package com.recipes.cookit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.recipes.CookIt.R
import com.recipes.cookit.entities.Recipes

class SubCategoryAdapter : RecyclerView.Adapter<SubCategoryAdapter.RecipeViewHolder>() {

    private var arrSubCategory = ArrayList<Recipes>()

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvDishName: TextView = view.findViewById(R.id.tvdishname)
    }

    fun setData(arrData: List<Recipes>) {
        arrSubCategory = arrData as ArrayList<Recipes>

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_sub_category, parent, false)
        return RecipeViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return arrSubCategory.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val category = arrSubCategory[position]
        holder.tvDishName.text = category.dishName
    }
}
