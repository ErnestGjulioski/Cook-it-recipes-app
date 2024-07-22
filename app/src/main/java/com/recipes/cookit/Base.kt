package com.recipes.cookit

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

open class Base :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    open lateinit var GetStartedBtn: Button

}