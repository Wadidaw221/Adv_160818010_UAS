package com.ubaya.a160818010_uts.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(News::class),version = 1)
abstract class NewsDatabase:RoomDatabase() {
    abstract fun newsDao():NewsDao

    companion object {
        @Volatile
        private var instance: NewsDatabase ?= null
        private val LOCK = Any()

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                NewsDatabase::class.java,
                "newnewsdb"
            ).build()

        operator fun invoke(context: Context) {
            if (instance != null) {
                synchronized(LOCK) {
                    instance ?: buildDatabase(context).also {
                        instance = it

                    }
                }
            }
        }
    }
}