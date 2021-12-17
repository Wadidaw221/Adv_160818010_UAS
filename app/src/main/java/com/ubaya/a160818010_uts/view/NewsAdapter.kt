package com.ubaya.a160818010_uts.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ubaya.a160818010_uts.R
import com.ubaya.a160818010_uts.databinding.NewsItemBinding
import com.ubaya.a160818010_uts.model.News
import kotlinx.android.synthetic.main.news_item.view.*

class NewsAdapter(val newsList:ArrayList<News>):RecyclerView.Adapter<NewsAdapter.NewsViewHolder>()
{
    class NewsViewHolder(var view:NewsItemBinding) : RecyclerView.ViewHolder(view.root)

    fun updateNewsList(newNewsList: List<News>){
        newsList.clear()
        newsList.addAll(newNewsList)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<NewsItemBinding>(inflater,R.layout.news_item,parent,false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

        holder.view.news = newsList[position]
//        holder.view.txtTitle.text = newsList[position].title.toString()
//        holder.view.txtOverview.text = newsList[position].overview
        holder.view.btnDetail.setOnClickListener {
            val act = news_listDirections.actionDetails(newsList[position].uuid)
            Navigation.findNavController(it).navigate(act)
        }


    }

    override fun getItemCount(): Int {
        return newsList.size
    }



}