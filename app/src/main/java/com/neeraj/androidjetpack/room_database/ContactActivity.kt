package com.neeraj.androidjetpack.room_database

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class ContactActivity : AppCompatActivity() {

    lateinit var mDatabase: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        mDatabase = ContactDatabase.getDatabaseInstance(this)

        GlobalScope.launch {
            mDatabase.getContactDao().insertContact(Contact(1, "Neeraj", "9910376825", Date(), 1))
        }



    }

}