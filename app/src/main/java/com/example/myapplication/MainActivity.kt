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
        val check1=findViewById<CheckBox>(R.id.checkBox)
        val check2=findViewById<CheckBox>(R.id.checkBox2)
        val check3=findViewById<CheckBox>(R.id.checkBox3)
        val check4=findViewById<CheckBox>(R.id.checkBox4)
        val check5=findViewById<CheckBox>(R.id.checkBox5)
        val check6=findViewById<CheckBox>(R.id.checkBox6)
        val check7=findViewById<CheckBox>(R.id.checkBox7)
        val check8=findViewById<CheckBox>(R.id.checkBox8)
        val check9=findViewById<CheckBox>(R.id.checkBox9)
        val check10=findViewById<CheckBox>(R.id.checkBox10)


        dodawanie.setOnClickListener {
            check1.isVisible=true
            check2.isVisible=true
            check3.isVisible=true
            check4.isVisible=true
            check5.isVisible=true
            check6.isVisible=true
            check7.isVisible=true
            check8.isVisible=true
            check9.isVisible=true
            check10.isVisible=true
        }
        odejmowanie.setOnClickListener {
            check1.isVisible=false
            check2.isVisible=false
            check3.isVisible=false
            check4.isVisible=false
            check5.isVisible=false
            check6.isVisible=false
            check7.isVisible=false
            check8.isVisible=false
            check9.isVisible=false
            check10.isVisible=false
        }
    }
}