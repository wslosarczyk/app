package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var idText = findViewById<TextView>(R.id.idText)
        idText.text = "nie kliknoles"

        var btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            idText.text = "Kliknoles"
        }
    }
}