package com.example.randomcat.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomcat.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer,FirstFragment())
            .commit()
    }
}