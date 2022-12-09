package com.example.bicyclewatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TireActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tire)
    }
    fun onButtonClickHome(view: View) {
        val intent = Intent(this@TireActivity, MainActivity::class.java)
        startActivity(intent)
    }
    fun onButtonClickMenu(view: View) {
        val intent = Intent(this@TireActivity, SelectActivity::class.java)
        startActivity(intent)
    }
}