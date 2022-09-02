package com.neeraj.androidjetpack.room_database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertContact (contact : Contact)

    @Delete
    suspend fun deleteContact (contact: Contact)

    @Update
    suspend fun updateContact (contact: Contact)

    @Query("SELECT * FROM contact_table ORDER BY id ASC")
    fun getAllContact() : LiveData<List<Contact>>

}