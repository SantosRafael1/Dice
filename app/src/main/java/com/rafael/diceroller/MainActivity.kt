package com.rafael.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val displayPlayedNumber = findViewById<TextView> (R.id.display_number)
        val diceImages = findViewById<ImageView> (R.id.dice_image)
        val playButton = findViewById<Button> (R.id.play_button)
        playButton.setOnClickListener {
            val dice = Dice(6)
            //displayPlayedNumber.text = dice.randomNumber.toString()
            when(dice.randomNumber) {
                1 -> diceImages.setImageResource(R.drawable.dice1)
                2 -> diceImages.setImageResource(R.drawable.dice2)
                3 -> diceImages.setImageResource(R.drawable.dice3)
                4 -> diceImages.setImageResource(R.drawable.dice4)
                5 -> diceImages.setImageResource(R.drawable.dice5)
                else -> diceImages.setImageResource(R.drawable.dice6)
            }
        }
    }
}

class Dice(private val number: Int) {
    val randomNumber = (1..number).random()
}