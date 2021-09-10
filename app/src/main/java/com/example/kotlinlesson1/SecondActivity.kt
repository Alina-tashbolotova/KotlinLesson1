package com.example.kotlinlesson1

import android.content.Intent
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
        buttonClick()
    }

    private fun acceptData() {

        val intentValue = intent.getStringExtra("Data")
        binding.txtSecond.apply {
            text = intentValue.toString()
        }

    }

    private fun buttonClick() {
        binding.btnSecondPush.setOnClickListener {
            val i = Intent(this, MainActivity::class.java).apply {
                putExtra("Key", binding.txtSecond.text.toString())
            }
            startActivity(i)
        }
    }
}