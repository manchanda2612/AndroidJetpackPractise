package com.neeraj.androidjetpack.binding_adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.neeraj.androidjetpack.R
import com.neeraj.androidjetpack.databinding.ActivityBindingAdapterBinding

class BindingAdapterActivity : AppCompatActivity() {

    lateinit var mDataBinding : ActivityBindingAdapterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_binding_adapter)

        val post = Post("Dog",
            "Black dogs are loyal to everyone",
            "https://res.cloudinary.com/demo/image/upload/v1312461204/sample.jpg")

        mDataBinding.post = post

    }

}