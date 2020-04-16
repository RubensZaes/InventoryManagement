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

        buttonFilterInexpensiveButton.setOnClickListener {
            showInexpensive()
        }

        buttonFilterByNameButton.setOnClickListener {
            showByName()
        }
    }

    fun showInexpensive() {
        val products = ProductsData().allProducts().filter { it.cost < 200 }
        showProducts(products)
    }

    fun showByName() {
        val products = ProductsData().allProducts().filter {it.owner.contains(AppConfig.filterByName, true)}
        showProducts(products)
    }

    private fun showProducts(products: List<Product>) {

        productsTextView.text = ""

        var totalCost = 0.0


        products.forEach {
                productsTextView.append("${it.name} - ${it.owner} - ${it.yearPurchased} - $${it.cost}\n \n")
                totalCost += it.cost
        }
        lastSavedProductTextView.text = "$ $totalCost"
    }
}
