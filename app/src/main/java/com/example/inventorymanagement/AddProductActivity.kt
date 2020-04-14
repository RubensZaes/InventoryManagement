package com.example.inventorymanagement

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_product.*

class AddProductActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_product)

        val addProductSubmitButton: Button = findViewById(R.id.addProductSubmitButton)
        addProductSubmitButton.setOnClickListener(View.OnClickListener { btnSubmitButton() })
    }

    private fun btnSubmitButton() {
        val database = getSharedPreferences("database", Context.MODE_PRIVATE)
        database.edit().apply {
            putString("savedProductName", productNameEditText.text.toString())
        }.apply()
    }
}