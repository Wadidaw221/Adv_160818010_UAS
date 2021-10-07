package com.ubaya.a160818010_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ubaya.a160818010_uts.R
import com.ubaya.a160818010_uts.model.News
import com.ubaya.a160818010_uts.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.fragment_news_list.*


class news_list : Fragment() {
    private lateinit var viewModel:ListViewModel
    private val newsAdapter = NewsAdapter(arrayListOf())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)
        viewModel.refresh()

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = newsAdapter

        ObserveModel()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?



    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_list, container, false)

    }
    fun ObserveModel(){
        viewModel.newsLD.observe(viewLifecycleOwner, Observer {
            newsAdapter.updateNewsList(it)
        })
        viewModel.newsLoadErrorLD.observe(viewLifecycleOwner, Observer {
            if(it == true) {
                txtError.visibility = View.VISIBLE
            } else {
                txtError.visibility = View.GONE
            }
        })
        viewModel.loadingLD.observe(viewLifecycleOwner, Observer {
            if(it == true) {
                recyclerView.visibility = View.GONE
                progressLoad.visibility = View.VISIBLE
            } else {
                recyclerView.visibility = View.VISIBLE
                progressLoad.visibility = View.GONE
            }
        })


    }


}