package com.neeraj.androidjetpack.liveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

        private val factLiveDataObject : MutableLiveData<String> = MutableLiveData("This is Live Data")

        val factLiveData : LiveData<String> = factLiveDataObject

        fun updateData() {
                factLiveDataObject.value = "This is updated Live Data"
        }

}