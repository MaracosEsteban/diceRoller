package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lateinit var diceImage : ImageView
        diceImage = findViewById(R.id.dice_image)





        val rollButton: Button = findViewById(R.id.roll_button)
        //The lateinit keyword promises the Kotlin compiler that the variable will be initialized before the code calls any operations on it.


        rollButton.setOnClickListener {

            val imRes = when ((1..6).random()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(imRes)
        }
    }



















}
