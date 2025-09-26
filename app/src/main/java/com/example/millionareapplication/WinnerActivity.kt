package com.example.millionareapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WinnerActivity : AppCompatActivity() {
    private lateinit var btnClose: Button
    private lateinit var tvWinValue: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_winner)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cash = intent.getIntExtra("cash", 0)
        tvWinValue = findViewById(R.id.tvWinValue)
        tvWinValue.text = cash.toString()

        btnClose = findViewById(R.id.button)
        btnClose.setOnClickListener{
            finish()
        }
    }
}