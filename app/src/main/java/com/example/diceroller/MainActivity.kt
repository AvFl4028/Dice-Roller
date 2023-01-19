package com.example.diceroller

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.logging.Logger

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRoll:Button = findViewById(R.id.button)
        btnRoll.setOnClickListener(){
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()


            val dice = Dice()
            val diceRoll = dice.roll()

            val diceImage:ImageView = findViewById(R.id.imageView)
            diceImage.contentDescription = diceRoll.toString()

            val drawableSources = when(diceRoll){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableSources)
            diceImage.contentDescription = diceRoll.toString()
            Log.v(TAG, diceRoll.toString())
        }
    }
}