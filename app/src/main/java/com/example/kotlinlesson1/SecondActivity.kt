package com.example.kotlinlesson1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinlesson1.databinding.ActivitySecondMainBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acceptData()

    }

    private fun acceptData() {

        val intentValue = intent.getStringExtra("Data")
        binding.txtSecond.apply {
            text = intentValue.toString()
        }

    }
}