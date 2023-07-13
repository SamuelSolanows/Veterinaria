package com.example.veterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaria.DataBase.DBconexion
import com.example.veterinaria.databinding.ActivityTipoBinding

class Tipo : AppCompatActivity() {
    lateinit var binding: ActivityTipoBinding
    lateinit var db:DBconexion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTipoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {

        }
    }
}