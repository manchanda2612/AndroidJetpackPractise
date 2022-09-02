package com.neeraj.androidjetpack.lifecycle

import android.util.Log
import androidx.lifecycle.*


class LifecycleObserver : DefaultLifecycleObserver  {

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d("Observer","OnStart")
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d("Observer","OnCreate")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("Observer","OnResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("Observer","OnPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d("Observer","OnStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d("Observer","OnDestroy")
    }

}
