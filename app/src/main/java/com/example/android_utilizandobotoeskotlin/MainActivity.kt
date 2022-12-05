package com.example.android_utilizandobotoeskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoVerde : Button = findViewById(R.id.botaoVerde)
        val botaoVermelho : Button = findViewById(R.id.botaoVermelho)
        val botaoAzul : Button = findViewById(R.id.botaoAzul)

        botaoVerde.setOnClickListener{
            Toast.makeText(applicationContext, "A cor é verde!", Toast.LENGTH_SHORT).show()
        }

        botaoVermelho.setOnClickListener{
            Toast.makeText(applicationContext, "A cor é vermelha", Toast.LENGTH_SHORT).show()
        }

        botaoAzul.setOnClickListener {
            Toast.makeText(applicationContext, "A cor é azul", Toast.LENGTH_SHORT).show()
        }
    }
}