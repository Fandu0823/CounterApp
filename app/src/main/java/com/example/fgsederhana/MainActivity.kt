package com.example.fgsederhana

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var counterTextView: TextView
    private lateinit var increaseButton: Button
    private lateinit var decreaseButton: Button

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout using the resource ID from R class
        setContentView(R.layout.activity_main)

        counterTextView = findViewById(R.id.counterTextView)
        increaseButton = findViewById(R.id.increaseButton)
        decreaseButton = findViewById(R.id.decreaseButton)

        updateCounterText()

        increaseButton.setOnClickListener {
            incrementCounter()
            updateCounterText()
        }

        decreaseButton.setOnClickListener {
            decrementCounter()
            updateCounterText()
        }
    }

    private fun incrementCounter() {
        counter++
    }

    private fun decrementCounter() {
        if (counter > 0) {
            counter--
        }
    }

    private fun updateCounterText() {
        counterTextView.text = counter.toString()
    }
}
