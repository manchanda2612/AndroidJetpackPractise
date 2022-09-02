package com.neeraj.androidjetpack.one_twoway_databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

     val liveDataObject : MutableLiveData<String> = MutableLiveData("Neeraj is a good boy")

    fun update() {
        liveDataObject.value = "Bharati is a good girl."
    }





}