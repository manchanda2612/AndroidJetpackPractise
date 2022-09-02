package com.neeraj.androidjetpack.retrofit_sample


import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteAPI {

    @GET("quotes")
    suspend fun getQuotes(@Query("page") page : Int) : QuoteList

}