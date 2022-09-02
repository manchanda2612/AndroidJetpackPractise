package com.neeraj.androidjetpack.one_twoway_databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.neeraj.androidjetpack.R
import com.neeraj.androidjetpack.databinding.ActivityOneTwoBindingSampleBinding

class SampleActivity : AppCompatActivity() {

    lateinit var mViewModel : MainViewModel
    lateinit var mDataBinding : ActivityOneTwoBindingSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_one_two_binding_sample)
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mDataBinding.viewModel = mViewModel
        mDataBinding.lifecycleOwner = this



    }


}