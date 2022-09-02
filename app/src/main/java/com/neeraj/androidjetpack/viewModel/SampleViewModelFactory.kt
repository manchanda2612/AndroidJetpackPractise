package com.neeraj.androidjetpack.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class SampleViewModelFactory(val initialCount : Int) : ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(ViewModelObserver::class.java)) {

            return ViewModelObserver(initialCount) as T

        } else {
            throw IllegalArgumentException("Unknown View Model class")
        }

    }


}