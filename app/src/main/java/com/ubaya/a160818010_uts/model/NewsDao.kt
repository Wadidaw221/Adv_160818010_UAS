package com.ubaya.a160818010_uts.model

import androidx.room.*

@Dao
interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg news: News)

    @Query("SELECT * FROM news")
    suspend fun selectAllNews():List<News>

    @Query("SELECT * FROM news WHERE uuid= :id")
    suspend fun selectNews(id:Int): News

    @Query("SELECT * FROM news WHERE overview= :overview")
    suspend fun selectCategory(overview:String): News

    @Delete
    suspend fun deleteNews(news:News)

}