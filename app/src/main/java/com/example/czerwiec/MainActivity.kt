package com.example.czerwiec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import com.example.czerwiec.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //initializing the binding class
        setContentView(binding.root)

        var licz = 0
        binding.like.setOnClickListener{
            licz += 1
            binding.licznik.text = licz.toString()
        }
        binding.usun.setOnClickListener {
            if(licz>0) {
                licz -= 1
            }
            else {
                licz = 0
            }
            binding.licznik.text = licz.toString()
            }
    }
}