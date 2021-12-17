package com.ubaya.a160818010_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.ubaya.a160818010_uts.R
import com.ubaya.a160818010_uts.model.News
import com.ubaya.a160818010_uts.viewmodel.DetailViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_news__add.*


class news_Add : Fragment() {

    private lateinit var viewModel:DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news__add, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =
            ViewModelProvider(this).get(DetailViewModel::class.java)

        btnAddNews.setOnClickListener{
            var news = News(txtTitle.text.toString(), txtOverview.text.toString(), txtNews.text.toString())
            val list = listOf(news)
            viewModel.addNews(list)
            Toast.makeText(view.context,"News Added",Toast.LENGTH_LONG).show()
            Navigation.findNavController(it).popBackStack()
        }
    }

}

