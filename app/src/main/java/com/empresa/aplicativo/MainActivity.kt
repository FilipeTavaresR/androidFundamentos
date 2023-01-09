package com.empresa.aplicativo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Activity Life I", "teste onCreate")
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.imgButton).setOnClickListener {
            startActivity(Intent(this@MainActivity, MainActivity2::class.java))
        }
    }


    override fun onStart() {
        super.onStart()
        Log.i("Activity Life I", "teste onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity Life I", "teste onResume")
    }

}