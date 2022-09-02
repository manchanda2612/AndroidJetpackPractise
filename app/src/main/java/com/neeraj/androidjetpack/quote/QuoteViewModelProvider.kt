package com.neeraj.androidjetpack.quote

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class QuoteViewModelProvider(val context : Context)  : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(QuoteViewModel::class.java)) {
            return QuoteViewModel(context) as T
        }
        throw IllegalArgumentException("Unknown Quote ViewModel Class")
    }

}