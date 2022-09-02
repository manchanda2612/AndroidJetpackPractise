package com.neeraj.androidjetpack.quote

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.neeraj.androidjetpack.R
import kotlinx.android.synthetic.main.activity_quote.*

class QuoteActivity : AppCompatActivity() {

    lateinit var mViewModel: QuoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)

        mViewModel = ViewModelProvider(this, QuoteViewModelProvider(application)).get(QuoteViewModel::class.java)

        setQuote()


    }

    private fun setQuote() {
        txv_quote.text = mViewModel.getQuote().text
        txv_quote_author.text = mViewModel.getQuote().author
    }

    fun onPreviousClick(view: View) {
        txv_quote.text = mViewModel.previousQuote().text
        txv_quote_author.text = mViewModel.previousQuote().author
    }

    fun onNextClick(view: View) {
        txv_quote.text = mViewModel.nextQuote().text
        txv_quote_author.text = mViewModel.nextQuote().author

    }

    fun onShareClick(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT, mViewModel.getQuote().text)
        startActivity(intent)

    }


}