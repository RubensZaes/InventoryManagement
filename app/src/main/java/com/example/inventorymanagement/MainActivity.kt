package com.example.inventorymanagement

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addInventoryButton: Button = findViewById(R.id.goToAddProductButton)
        addInventoryButton.setOnClickListener(View.OnClickListener { buttonGoToAddProduct() })

        }

    private fun buttonGoToAddProduct() {
//        val text = "The button action is working!"
//        val duration = Toast.LENGTH_SHORT
//        val toast = Toast.makeText(this, text, duration)
//        toast.show()

        val intent = Intent(this, AddProductActivity::class.java)
        startActivity(intent)
    }
}
