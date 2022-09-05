package com.jaemin.androidplayground.ui.sub

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.jaemin.androidplayground.R

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        Log.d("SubActivity", "onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("SubActivity", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SubActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SubActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SubActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SubActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SubActivity", "onDestroy")
    }
}