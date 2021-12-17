package com.ubaya.a160818010_uts.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.ubaya.a160818010_uts.model.News
import com.ubaya.a160818010_uts.model.NewsDatabase
import com.ubaya.a160818010_uts.util.buildDb
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

 class DetailViewModel(application: Application): AndroidViewModel(application),CoroutineScope {
     private val job = Job()
     val newsLD = MutableLiveData<News>()

    fun addNews(list: List<News>){
        launch {
            val db = buildDb(getApplication())
            db.newsDao().insertAll(*list.toTypedArray())
        }
    }
     fun displayDetail(id:Int){
        launch {
            val db = buildDb(getApplication())
            newsLD.value = db.newsDao().selectNews(id)
        }
     }
     fun displayKategori(overview:String){
         launch {
             val db = buildDb(getApplication())
             newsLD.value = db.newsDao().selectCategory(overview)
         }
     }
    override val coroutineContext: CoroutineContext
        get() = job+ Dispatchers.Main

}