package com.neeraj.androidjetpack.dataBinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.neeraj.androidjetpack.R
import com.neeraj.androidjetpack.databinding.ActivitySampleDataBindingBinding

class DataBindingSampleActivity : AppCompatActivity() {

    lateinit var mDataBinding : ActivitySampleDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_sample_data_binding)
        val quoteObject = Quote("The quick brown fox jumps over the little lazy dog", "Neeraj Manchanda")
        mDataBinding.quote = quoteObject

    }
}