package com.littlelemon.menu

import org.junit.Assert.*
import org.junit.Test

class FilterHelperTest {

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        val sampleProductsList = mutableListOf(
            ProductItem("Black tea", 3.00, "Drinks", R.drawable.black_tea),
            ProductItem("Croissant", 7.00, "Dessert", R.drawable.croissant),
            ProductItem("Bouillabaisse", 20.00, "Food", R.drawable.bouillabaisse),
        )
        val filterHelper = FilterHelper()

        val expected = mutableListOf(
            ProductItem("Croissant", 7.00, "Dessert", R.drawable.croissant),
        )
        val actual = filterHelper.filterProducts(FilterType.Dessert, sampleProductsList)

        assertEquals(expected, actual)
    }
}