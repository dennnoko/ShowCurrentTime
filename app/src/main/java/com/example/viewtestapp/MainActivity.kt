package com.example.viewtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.viewtestapp.databinding.ActivityMainBinding
import java.util.Date

class MainActivity : AppCompatActivity() {
    //ViewBinding
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCurrent.setOnClickListener {
            binding.textResult.text = Date().toString()
        }
    }
}