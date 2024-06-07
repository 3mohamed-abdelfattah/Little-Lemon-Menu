package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val title = intent.getStringExtra(MainActivity.KEY_TITLE) ?: ""
        val price = intent.getDoubleExtra(MainActivity.KEY_PRICE, 0.0)
        val image = intent.getIntExtra(MainActivity.KEY_IMAGE, -1)
        val category = intent.getStringExtra(MainActivity.KEY_CATEGORY) ?: ""
        val productItem = ProductItem(title, price, category, image)
        setContent { ProductDetails(productItem) }
    }
}