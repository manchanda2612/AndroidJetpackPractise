package com.neeraj.androidjetpack.room_database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "contact_table")
data class Contact(@PrimaryKey(autoGenerate = true) val id : Int, val name : String, val phone : String, val createdDate : Date, val isActive : Int)