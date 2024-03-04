package com.example.menus_and_pickersexercise1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.menus_and_pickersexercise1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var food = ""

        binding.donutImg.setOnClickListener{
            Toast.makeText(this, "You ordered a donut.", Toast.LENGTH_SHORT).show()
            food = "Donut"
        }
        binding.iceScreamSandwichImg.setOnClickListener{
            Toast.makeText(this, "You ordered an ice scream sandwich.", Toast.LENGTH_SHORT).show()
            food = "Ice scream sandwich"
        }
        binding.frozenYogurtImg.setOnClickListener{
            Toast.makeText(this, "You ordered a frozen yogurt.", Toast.LENGTH_SHORT).show()
            food = "Frozen yogurt"
        }

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("FOOD", food)
            startActivity(intent)
        }
    }
}