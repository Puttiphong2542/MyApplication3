package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var number = Num1.text.toString()
            var number1 = Num2.text.toString()
            if(number.isEmpty() || number1.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView4.text = "+"
            textView6.text = (number.toDouble() + number1.toDouble()).toString()
        }
        button2.setOnClickListener {
            var number = Num1.text.toString()
            var number1 = Num2.text.toString()
            if(number.isEmpty() || number1.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView4.text = "-"
            textView6.text = (number.toDouble() - number1.toDouble()).toString()
        }
        button3.setOnClickListener {
            var number = Num1.text.toString()
            var number1 = Num2.text.toString()
            if(number.isEmpty() || number1.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView4.text = "*"
            textView6.text = (number.toDouble() * number1.toDouble()).toString()
        }
        button4.setOnClickListener {
            var number = Num1.text.toString()
            var number1 = Num2.text.toString()
            if(number.isEmpty() || number1.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView4.text = "/"
            textView6.text = (number.toDouble() / number1.toDouble()).toString()
        }
        button5.setOnClickListener {
            var number = Num1.text.toString()
            var number1 = Num2.text.toString()
            if(number.isEmpty() || number1.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView4.text = "%"
            textView6.text = (number.toDouble() % number1.toDouble()).toString()
        }
        button6.setOnClickListener {
            Num1.text.clear()
            Num2.text.clear()
            textView4.text = " "
            textView6.text = " "
        }
    }
}