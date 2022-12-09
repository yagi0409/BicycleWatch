package com.example.bicyclewatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onButtonClick(view: View) {
        val intent = Intent(this@MainActivity, SelectActivity::class.java)
        startActivity(intent)
    }
}