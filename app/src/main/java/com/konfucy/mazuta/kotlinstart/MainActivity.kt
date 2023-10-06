package com.konfucy.mazuta.kotlinstart

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Изменяемая переменная
    var textTest = "0"

    //Неизменяемая переменная (КОНСТАНТА)
    val intTest = 0


    var a = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        textTest = (intTest + 5).toString()
    }

    fun onClickTest(view: View) {
        val text = findViewById<TextView>(R.id.textView)
        a++
        if (a % 2 == 0) {
            text.text = "www"
        } else {
            text.text = "RRR"
        }


    }
}
