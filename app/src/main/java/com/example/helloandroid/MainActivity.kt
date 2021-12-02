package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGreet.setOnClickListener {
            binding.tvGreeting.text = getString(R.string.button_pressed_message)
        }

        binding.button2.setOnClickListener {
            binding.tvGreeting.text = getString(R.string.button2_pressed_message)
        }

    }
}

