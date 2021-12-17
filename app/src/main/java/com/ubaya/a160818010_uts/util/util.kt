package com.ubaya.a160818010_uts.util

import android.content.Context
import androidx.room.Room
import com.ubaya.a160818010_uts.model.NewsDatabase


val DB_NAME = "newnewsdb"
fun buildDb(context: Context):NewsDatabase{
    val db = Room.databaseBuilder(
        context,NewsDatabase::class.java,
        DB_NAME).build()
    return db
}