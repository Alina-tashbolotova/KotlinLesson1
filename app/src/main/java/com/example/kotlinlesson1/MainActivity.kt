package com.example.kotlinlesson1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinlesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttonClick()
        acceptData()

    }

    private fun buttonClick() {

        binding.buttonPush.setOnClickListener {
            val user_error: String = binding.editText.text.toString()
            if (user_error.trim().isEmpty()) {
                binding.editText.error = "Enter text"
                Toast.makeText(applicationContext, "You need to enter text ", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(applicationContext, "Login Successful ", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("Data", binding.editText.text.toString())
                }
                startActivity(intent)
            }
        }
    }

    private fun acceptData() {
        val intentValue = intent.getStringExtra("Key")
        binding.txtPush.apply {
            text = intentValue.toString()
        }
    }
}