package com.example.bicyclewatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)
    }
    fun onButtonClickGPS(view: View) {
        val intent = Intent(this@SelectActivity, MapsActivity::class.java)
        startActivity(intent)
    }
    fun onButtonClickTire(view: View) {
        val intent = Intent(this@SelectActivity, TireActivity::class.java)
        startActivity(intent)
    }
    fun onButtonClickBattery(view: View) {
        val intent = Intent(this@SelectActivity, BatteryActivity::class.java)
        startActivity(intent)
    }
    fun onButtonClickHome(view: View) {
        val intent = Intent(this@SelectActivity, MainActivity::class.java)
        startActivity(intent)
    }
}