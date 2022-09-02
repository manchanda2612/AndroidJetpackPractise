package com.neeraj.androidjetpack.room_database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [Contact::class], version = 2, exportSchema = false)
@TypeConverters(Convertors::class)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun getContactDao(): ContactDao

    companion object {

        private val migration_1_2 = object : Migration(1, 2) {

            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE contact_table ADD COLUMN isActive INTEGER NOT NULL DEFAULT(1)")
            }

        }

        private var mDatabaseInstance: ContactDatabase? = null

        fun getDatabaseInstance(context: Context): ContactDatabase {

            if (null == mDatabaseInstance) {
                synchronized(this) {
                    mDatabaseInstance = Room.databaseBuilder(
                        context.applicationContext,
                        ContactDatabase::class.java,
                        "contact_database"
                    ).addMigrations(migration_1_2)
                        .build()
                }
            }
            return mDatabaseInstance!!
        }
    }
}