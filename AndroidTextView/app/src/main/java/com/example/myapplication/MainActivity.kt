package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txtView = findViewById(R.id.txtView) as TextView
        txtView.text = "Hello world---Ahihi"
        txtView.setTextColor(Color.parseColor("#a4c639"));

    }
}
