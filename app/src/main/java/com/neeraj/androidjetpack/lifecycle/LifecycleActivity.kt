package com.neeraj.androidjetpack.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.neeraj.androidjetpack.R

class LifecycleActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        Log.d("Activity", "OnStart")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(LifecycleObserver())

        Log.d("Activity", "OnCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity", "OnCreate")
    }

    fun increment(view: android.view.View) {}
}