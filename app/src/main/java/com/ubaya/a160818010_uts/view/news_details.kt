package com.ubaya.a160818010_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ubaya.a160818010_uts.R
import com.ubaya.a160818010_uts.viewmodel.DetailViewModel
import com.ubaya.a160818010_uts.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.fragment_news_details.*


class news_details : Fragment() {
    private lateinit var viewModel:DetailViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        viewModel.Details()
        observeModel()

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_details, container, false)
    }

    fun observeModel(){
        viewModel.newsLD.observe(viewLifecycleOwner, Observer {
            txtJudulDetail.text = it.title
            txtIsiBerita1.text = it.newsText
        })
    }


}