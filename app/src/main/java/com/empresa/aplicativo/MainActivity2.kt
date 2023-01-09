package com.empresa.aplicativo

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val botao = findViewById<Button>(R.id.button)
        val texto = findViewById<TextView>(R.id.text)

        var index = 0

        botao.setOnClickListener {

            texto.text = "Foda-se Click ${++index} vezes"
            Toast.makeText(this, "Ola Mundo", Toast.LENGTH_LONG).show()
        }
    }

}