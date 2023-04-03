package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dodawanie=findViewById<RadioButton>(R.id.radio1)
        val odejmowanie=findViewById<RadioButton>(R.id.radio2)

        dodawanie.setOnClickListener {
            findViewById<CheckBox>(R.id.checkBox).isVisible=true
        }
        odejmowanie.setOnClickListener {
            findViewById<CheckBox>(R.id.checkBox).isVisible=false
        }
    }
}