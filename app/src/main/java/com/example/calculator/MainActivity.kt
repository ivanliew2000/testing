package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


        fun onDigit(view: View) {
            val tvInput = findViewById<TextView>(R.id.tvInput)
            tvInput.append((view as Button).text)
        }

        fun onClear(view: View) {
            val tvInput = findViewById<TextView>(R.id.tvInput)
            tvInput.text = ""
        }

        fun onDecimalPoint(view: View) {
            var lastNumeric: Boolean = false
            var lastDot: Boolean = false
            if (lastNumeric && !lastDot){
                val tvInput = findViewById<TextView>(R.id.tvInput)
                tvInput.append(".")
                lastNumeric=false
                lastDot=true
        }
    }
}