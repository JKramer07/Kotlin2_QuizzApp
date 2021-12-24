package com.geek.kotlin2_quizzapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geek.kotlin2_quizzapp.MainActivity
import com.geek.kotlin2_quizzapp.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}