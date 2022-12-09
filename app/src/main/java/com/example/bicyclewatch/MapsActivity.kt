package com.example.bicyclewatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MapsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
    }
    fun onButtonClickHome(view: View) {
        val intent = Intent(this@MapsActivity, MainActivity::class.java)
        startActivity(intent)
    }
    fun onButtonClickMenu(view: View) {
        val intent = Intent(this@MapsActivity, SelectActivity::class.java)
        startActivity(intent)
    }
}