package com.ubaya.a160818010_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ubaya.a160818010_uts.R
import com.ubaya.a160818010_uts.databinding.FragmentNewsCelebBinding
import com.ubaya.a160818010_uts.databinding.FragmentNewsCovidBinding
import com.ubaya.a160818010_uts.viewmodel.DetailViewModel
import kotlinx.android.synthetic.main.fragment_news__celeb.*


class news_Celeb : Fragment() {

    private lateinit var viewModel: DetailViewModel
    private lateinit var dataBinding: FragmentNewsCelebBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        var cat = "Celeb"
        viewModel.displayKategori(cat)
        observeModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            dataBinding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_news__celeb, container, false)
            return dataBinding.root

        // Inflate the layout for this fragment
    }

    fun observeModel() {
        viewModel.newsLD.observe(viewLifecycleOwner, Observer {
            dataBinding.news = it
        })
    }


}