package com.ubaya.a160818010_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ubaya.a160818010_uts.R
import kotlinx.android.synthetic.main.fragment_news__fresh.*


class news_Fresh : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtFreshNewsTitle.text = "Jokowi Panggil Anies ke Istana, Ini yang Dibahas"
        txtIsiFreshNews.text = "Presiden Joko Widodo (Jokowi) memanggil Gubernur DKI Jakarta Anies Baswedan ke Istana Kepresidenan,\n" +
                "Kamis (7/10). Anies mengaku hanya melaporkan situasi terkini penanganan Covid-19 di Jakarta yang terkendali."
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news__fresh, container, false)
    }


}