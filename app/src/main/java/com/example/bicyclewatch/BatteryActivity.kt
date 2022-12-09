package com.example.bicyclewatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView

class BatteryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battery)
        val linkText = findViewById<TextView>(R.id.tvLink)
        linkText.setMovementMethod(LinkMovementMethod.getInstance())
    }
    fun onButtonClickHome(view: View) {
        val intent = Intent(this@BatteryActivity, MainActivity::class.java)
        startActivity(intent)
    }
    fun onButtonClickMenu(view: View) {
        val intent = Intent(this@BatteryActivity, SelectActivity::class.java)
        startActivity(intent)
    }
}
