package com.rafael.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val displayPlayedNumber = findViewById<TextView> (R.id.display_number)
        val playButton = findViewById<Button> (R.id.play_button)
        playButton.setOnClickListener {
            val dice = Dice(6)
            //displayPlayedNumber.text = dice.randomNumber.toString()
        }
    }
}

class Dice(private val number: Int) {
    val randomNumber = (1..number).random()
}