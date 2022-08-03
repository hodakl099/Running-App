package com.androiddevs.runningappyt.db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Run::class],
    version = 1
)
abstract class RunningDataBase : RoomDatabase(){

   abstract fun getRunDao() : RunDao

}