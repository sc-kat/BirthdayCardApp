package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * This activity allows the used to push a button and view the result on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(3)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView6)
        resultTextView.text = diceRoll.toString()

    }
}

class Dice(private val numSides: Int) {
    fun roll(): String? {
        var result: String? = null
        when((1..numSides).random()){
            1 -> result = "Wish you a fruitful year!"
            2 -> result = "Wish you a happy and merry life!"
            3 -> result = "Bla bla bla!"
        }
        return result
    }
}