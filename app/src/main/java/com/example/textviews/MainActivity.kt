package com.example.textviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.textviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var count = 0
        binding.btnAdd.setOnClickListener {
            count++
            binding.tvCounter.text = "Let`s count together: $count"
        }

        binding.btnSubtract.setOnClickListener {
            count--
            binding.tvCounter.text = "Let`s count together: $count"
        }


    }
}