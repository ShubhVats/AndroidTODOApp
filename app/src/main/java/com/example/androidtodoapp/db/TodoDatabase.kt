package com.example.androidtodoapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.androidtodoapp.Todo

@Database(entities = [Todo::class], version = 1)
@TypeConverters(Converters::class)
abstract class TodoDatabase :RoomDatabase() {
    companion object {
        const val NAME = "TODO_DB"
    }

    abstract fun getTodoDao(): TodoDao
}