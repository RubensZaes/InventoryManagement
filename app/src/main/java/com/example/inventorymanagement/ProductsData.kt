package com.example.inventorymanagement

class ProductsData {
    fun allProducts(): List<Product> {
        return listOf(
            Product("Kotlin", "Rubens", 2020, 600.00),
            Product("Android", "Stanley Rubens", 2020, 1020.37),
            Product("Python", "Rubens Almeida", 2020, 100.51),
            Product("Java", "Brandao Rubens", 2020, 435.00)
        )
    }
}