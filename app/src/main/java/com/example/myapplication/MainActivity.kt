package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)
        val upButton:Button = findViewById(R.id.ButtonCountUp)

        rollButton.setOnClickListener {
            resultText.text = (1..6).random().toString()

        }


        upButton.setOnClickListener {
            resultText.text =
                if (resultText.text.toString() == "ButtonCountUp") "ButtonCountUp" else {
                    var num = resultText.text.toString().toInt()
                    if (num < 6) num++
                    num.toString()
                }
        }

    }
}