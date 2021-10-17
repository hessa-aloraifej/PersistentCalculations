package com.example.persistentcalculations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var doubletext=findViewById<EditText>(R.id.doublet)
        var floattext=findViewById<EditText>(R.id.floatet)
        var result=findViewById<TextView>(R.id.textView4)
        var multiplybtn=findViewById<Button>(R.id.button)
        multiplybtn.setOnClickListener {
            var number1=doubletext.text.toString().toDouble()
            var number2=floattext.text.toString().toFloat()
            var multiplication=number1*number2
            result.text= multiplication.toString()
        }
    }
}