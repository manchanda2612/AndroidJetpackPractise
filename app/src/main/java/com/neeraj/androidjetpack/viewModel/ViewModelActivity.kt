package com.neeraj.androidjetpack.viewModel

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.neeraj.androidjetpack.R
import kotlinx.android.synthetic.main.activity_main.*

class ViewModelActivity : AppCompatActivity() {

    private lateinit var mViewModelObserver: ViewModelObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModelObserver = ViewModelProvider(this, SampleViewModelFactory(10)).get(
            ViewModelObserver::class.java)
        setText()

    }

    fun increment(view : View) {
        mViewModelObserver.incrementCounter()
        setText()
    }

    private fun setText() {
        txv_counter.text = mViewModelObserver.mCounter.toString()
    }

}