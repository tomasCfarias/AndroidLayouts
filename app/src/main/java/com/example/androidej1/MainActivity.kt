package com.example.androidej1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.androidej1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonSumar.setOnClickListener(){
            val nro1 = binding.numero1.text.toString().toInt()
            val nro2 = binding.numero2.text.toString().toInt()
            val resultado = nro1 + nro2
            binding.resultado.text = resultado.toString()
        }
    }



}