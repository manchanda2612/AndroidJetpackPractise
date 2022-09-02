package com.neeraj.androidjetpack.retrofit_sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.neeraj.androidjetpack.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.math.log

@DelicateCoroutinesApi
class QuoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quoteAPI = RetrofitHelper.getRetrofitInstance().create(QuoteAPI::class.java)

        GlobalScope.launch {
            val quoteList = quoteAPI.getQuotes(1)
            val quoteResults = quoteList.results

            quoteResults.forEach {
                Log.d("Quote = ", it.content)
            }
        }
    }

    fun increment(view: android.view.View) {}

}