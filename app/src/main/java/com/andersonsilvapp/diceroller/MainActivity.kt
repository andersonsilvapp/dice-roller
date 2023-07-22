package com.andersonsilvapp.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.andersonsilvapp.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.rollButton.setOnClickListener { rollDice() }
    binding.countUpButton.setOnClickListener { countUp() }
  }

  private fun rollDice() {
    //Toast.makeText(this,  "button clicked",
    //Toast.LENGTH_SHORT).show()

    val randomInt = (1..6).random()

    binding.resultText.text = randomInt.toString()
  }

  private fun countUp() {
    var textValue = binding.resultText

    if (textValue.text == "Hello World!") {
      textValue.text = "1"
    } else {
      var resultInt = binding.resultText.text.toString().toInt()

      if (resultInt < 6) {
        resultInt++
        textValue.text = resultInt.toString()
      }
    }
  }

}