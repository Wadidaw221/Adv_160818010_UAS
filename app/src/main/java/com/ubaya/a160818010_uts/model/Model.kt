package com.ubaya.a160818010_uts.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class News(
    @ColumnInfo(name="title") var title:String?,  @ColumnInfo(name="overview") var overview:String?,
    @ColumnInfo(name="text") var newsText:String?){
    @PrimaryKey(autoGenerate = true)
    var uuid:Int = 0;
}


