package com.example.veterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnRaza.setOnClickListener {
                startActivity(Intent(this@MainActivity, Raza::class.java))
            }
            btnMascota.setOnClickListener {
                startActivity(Intent(this@MainActivity, Mascota::class.java))
            }
            btnTipo.setOnClickListener {
                startActivity(Intent(this@MainActivity, Tipo::class.java))
            }
            btnVacuna.setOnClickListener {
                startActivity(Intent(this@MainActivity, Vacuna::class.java))
            }
        }
    }
}