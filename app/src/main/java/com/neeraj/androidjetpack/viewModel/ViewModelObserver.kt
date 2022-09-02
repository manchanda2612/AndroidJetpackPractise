package com.neeraj.androidjetpack.viewModel

import androidx.lifecycle.ViewModel

class ViewModelObserver(private val initialCounter : Int) : ViewModel() {

    var mCounter : Int = initialCounter

    fun incrementCounter() {
        mCounter++
    }

}