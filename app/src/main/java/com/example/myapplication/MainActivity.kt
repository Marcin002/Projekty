package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.core.view.isVisible
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dodawanie=findViewById<RadioButton>(R.id.radio1)
        val odejmowanie=findViewById<RadioButton>(R.id.radio2)
        val chip=findViewById<ChipGroup>(R.id.chipGroup)
        val chipg2=findViewById<ChipGroup>(R.id.chipGroup2)
        val chipg3=findViewById<ChipGroup>(R.id.chipGroup3)

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

        val chip1=findViewById<Chip>(R.id.chip1)
        val chip2=findViewById<Chip>(R.id.chip2)
        val chip3=findViewById<Chip>(R.id.chip3)
        val chip4=findViewById<Chip>(R.id.chip4)
        val chip5=findViewById<Chip>(R.id.chip5)
        val chip6=findViewById<Chip>(R.id.chip6)
        val chip7=findViewById<Chip>(R.id.chip7)
        val chip8=findViewById<Chip>(R.id.chip8)
        val chip9=findViewById<Chip>(R.id.chip9)
        val chip10=findViewById<Chip>(R.id.chip10)




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

        chip1.isVisible=false
        chip2.isVisible=false
        chip3.isVisible=false
        chip4.isVisible=false
        chip5.isVisible=false
        chip6.isVisible=false
        chip7.isVisible=false
        chip8.isVisible=false
        chip9.isVisible=false
        chip10.isVisible=false


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
            chip.isVisible=false
            chipg2.isVisible=false
            chipg3.isVisible=false
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


            chip.isVisible=true
            chipg2.isVisible=true
            chipg3.isVisible=true
            when(check1.isChecked){
                true ->{ chip1.isVisible = true }
                false ->{ chip1.isVisible = false }
            }
            when(check2.isChecked){
                true ->{ chip2.isVisible = true }
                false ->{ chip2.isVisible = false }
            }
            when(check3.isChecked){
                true ->{ chip3.isVisible = true }
                false ->{ chip3.isVisible = false }
            }
            when(check4.isChecked){
                true ->{ chip4.isVisible = true }
                false ->{ chip4.isVisible = false }
            }
            when(check5.isChecked){
                true ->{ chip5.isVisible = true }
                false ->{ chip5.isVisible = false }
            }
            when(check6.isChecked){
                true ->{ chip6.isVisible = true }
                false ->{ chip6.isVisible = false }
            }
            when(check7.isChecked){
                true ->{ chip7.isVisible = true }
                false ->{ chip7.isVisible = false }
            }
            when(check8.isChecked){
                true ->{ chip8.isVisible = true }
                false ->{ chip8.isVisible = false }
            }
            when(check9.isChecked){
                true ->{ chip9.isVisible = true }
                false ->{ chip9.isVisible = false }
            }
            when(check10.isChecked){
                true ->{ chip10.isVisible = true }
                false ->{ chip10.isVisible = false }
            }
        }
    }
}