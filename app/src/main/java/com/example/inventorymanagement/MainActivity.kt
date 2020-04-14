package com.example.inventorymanagement

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val preferences = getSharedPreferences("database", Context.MODE_PRIVATE)
        val saveNme = preferences.getString("savedProductName", "This value doesn't exist.")
        d("rubens", "saved message: $saveNme")

        lastSavedProductTextView.text = saveNme

        goToAddProductButton.setOnClickListener {
            startActivity(Intent(this, AddProductActivity::class.java))
        }

//        val addInventoryButton: Button = findViewById(R.id.goToAddProductButton)
//        addInventoryButton.setOnClickListener(View.OnClickListener { buttonGoToAddProduct() })

        }

//    private fun buttonGoToAddProduct() {
////        val text = "The button action is working!"
////        val duration = Toast.LENGTH_SHORT
////        val toast = Toast.makeText(this, text, duration)
////        toast.show()
//
//        val intent = Intent(this, AddProductActivity::class.java)
//        startActivity(intent)
//    }
}
