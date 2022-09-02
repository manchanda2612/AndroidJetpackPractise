package com.neeraj.androidjetpack.liveData

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.neeraj.androidjetpack.R
import kotlinx.android.synthetic.main.activity_sample.*

class SampleActivity : AppCompatActivity() {

    lateinit var mViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mViewModel.factLiveData.observe(this, Observer {
            txv_act_sample.text = it
        })
    }

    fun onUpdateClick(view: View) {

       mViewModel.updateData()

    }


}