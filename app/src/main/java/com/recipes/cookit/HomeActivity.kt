package com.recipes.cookit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.recipes.CookIt.R
import com.recipes.cookit.adapter.MainCategoryAdapter
import com.recipes.cookit.adapter.SubCategoryAdapter
import com.recipes.cookit.entities.Recipes

class HomeActivity : AppCompatActivity() {
    private var arrMainCategory = ArrayList<Recipes>()
    private var arrSubCategory = ArrayList<Recipes>()

    private var mainCategoryAdapter = MainCategoryAdapter()
    private var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Temp data
        arrMainCategory.add(Recipes(0, "Beef"))
        arrMainCategory.add(Recipes(1, "Chicken"))
        arrMainCategory.add(Recipes(2, "Lamb"))
        arrMainCategory.add(Recipes(3, "Dessert"))

        arrSubCategory.add(Recipes(0, "Beef with garlic butter"))
        arrSubCategory.add(Recipes(1, "Schnitzel"))
        arrSubCategory.add(Recipes(2, "Lamb with sauce"))
        arrSubCategory.add(Recipes(3, "Dessert with ice"))

        mainCategoryAdapter.setData(arrMainCategory)
        subCategoryAdapter.setData(arrSubCategory)

        // Initialize the RecyclerViews
        val rvMainCategory = findViewById<RecyclerView>(R.id.rv_main_category)
        val rvSubCategory = findViewById<RecyclerView>(R.id.rv_sub_category)

        rvMainCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvMainCategory.adapter = mainCategoryAdapter

        rvSubCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvSubCategory.adapter = subCategoryAdapter
    }
}
