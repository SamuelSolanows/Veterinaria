package com.example.veterinaria

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import androidx.annotation.RequiresApi
import androidx.appcompat.app.WindowDecorActionBar
import androidx.core.os.postDelayed
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        CuebtaRegresiva()
        PantallaCompleta()

    }

    private fun PantallaCompleta() {
        WindowInsetsControllerCompat(
            window, window.decorView
        ).hide(WindowInsetsCompat.Type.systemBars())
    }

    private fun CuebtaRegresiva() {
        Handler(Looper.myLooper()!!).postDelayed(5000){
            startActivity(Intent(this@Splash, MainActivity::class.java))
        }
    }
}