package com.example.inventorymanagement

class ProductsData {
    fun allProducts(): List<Product> {
        return listOf(
            Product("Kotlin", "Rubens", 2020, 100.00),
            Product("Android", "Stanley", 2020, 20.37),
            Product("Python", "Almeida", 2020, 100.51),
            Product("Java", "Brandao", 2020, 435.00)
        )
    }
}