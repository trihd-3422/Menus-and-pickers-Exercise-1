package com.example.menus_and_pickersexercise1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.menus_and_pickersexercise1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val food = intent.getStringExtra("FOOD")
        binding.title.text = "You ordered a $food"

        binding.radioButton1.setOnClickListener{
            Toast.makeText(this, "Same day messenger service", Toast.LENGTH_SHORT).show()
            binding.radioButton1.isChecked = true
            binding.radioButton2.isChecked = false
            binding.radioButton3.isChecked = false
        }
        binding.radioButton2.setOnClickListener{
            Toast.makeText(this, "Next day ground delivery", Toast.LENGTH_SHORT).show()
            binding.radioButton1.isChecked = false
            binding.radioButton2.isChecked = true
            binding.radioButton3.isChecked = false
        }
        binding.radioButton3.setOnClickListener{
            Toast.makeText(this, "Pick up", Toast.LENGTH_SHORT).show()
            binding.radioButton1.isChecked = false
            binding.radioButton2.isChecked = false
            binding.radioButton3.isChecked = true
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}