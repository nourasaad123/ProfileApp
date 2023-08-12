package com.example.myappwithroomdatabase.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Profile::class],
    version = 1
)
abstract class ProfileDatabase:RoomDatabase(){
    abstract fun retrieveProfileDao():ProfileDao
}