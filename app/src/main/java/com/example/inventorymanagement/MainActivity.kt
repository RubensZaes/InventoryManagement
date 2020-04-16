package com.example.inventorymanagement

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            startActivity(Intent(this, AddProductActivity::class.java))
        }

        var products = listOf(
            Product("Kotlin", "Rubens", 2020, 600.00),
            Product("Android", "Stanley", 2020, 1020.37),
            Product("Python", "Almeida", 2020, 100.51),
            Product("Java", "Brandao", 2020, 435.00),
            Product("Kotlin", "Rubens", 2020, 600.00),
            Product("Android", "Stanley", 2020, 1020.37),
            Product("Python", "Almeida", 2020, 100.51),
            Product("Java", "Brandao", 2020, 435.00),
            Product("Kotlin", "Rubens", 2020, 600.00),
            Product("Android", "Stanley", 2020, 1020.37),
            Product("Python", "Almeida", 2020, 100.51),
            Product("Java", "Brandao", 2020, 435.00),
            Product("Kotlin", "Rubens", 2020, 600.00),
            Product("Android", "Stanley", 2020, 1020.37),
            Product("Python", "Almeida", 2020, 100.51),
            Product("Java", "Brandao", 2020, 435.00),
            Product("Kotlin", "Rubens", 2020, 600.00),
            Product("Android", "Stanley", 2020, 1020.37),
            Product("Python", "Almeida", 2020, 100.51),
            Product("Java", "Brandao", 2020, 435.00)
        )

        var totalCost = 0.0

        products.forEach {
            productsTextView.append("${it.name} - ${it.owner} - ${it.yearPurchased} - $${it.cost}\n \n")
            totalCost += it.cost
        }

        lastSavedProductTextView.text = "$ $totalCost"
    }
}
