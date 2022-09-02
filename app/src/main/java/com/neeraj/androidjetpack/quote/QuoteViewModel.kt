package com.neeraj.androidjetpack.quote

import android.content.Context
import androidx.lifecycle.ViewModel
import com.google.gson.Gson

class QuoteViewModel(val context : Context) : ViewModel() {

    lateinit var quoteList: Array<Quote>
    var index : Int = 0

    init {

        quoteList = fetchQuoteList()

    }

    fun getQuote() = quoteList[index]

    fun nextQuote() : Quote {
        if (index < quoteList.size) {
            return quoteList[++index]
        } else {
            index = 0
            return quoteList[index]
        }
    }

    fun previousQuote() = quoteList[--index]

    private fun fetchQuoteList(): Array<Quote> {

        val inputStream = context.assets.open("quote.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        return gson.fromJson(json, Array<Quote>::class.java)

    }


}