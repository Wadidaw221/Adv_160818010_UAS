package com.ubaya.a160818010_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ubaya.a160818010_uts.R
import kotlinx.android.synthetic.main.fragment_news__celeb.*


class news_Celeb : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtCelebJudul1.text ="Ade Londok Balik Jadi Tukang Jahit, Ucapannya Cibir Profesi Artis Jadi Sorotan"
        txtCelebIsi1.text = "empat viral karena mempromosikan odading di Bandung sampai diundang ke beberapa acara televisi, nama Ade Londok kini meredup. Ia pun memilih untuk kembali menjadi tukang jahit pakaian.\n" +
                "\n" +
                "Akun instagram @jakarta.keras mengunggah video Ade saat sedang menjahit di pinggir jalan. Seseorang yang tak diketahui identitasnya bertanya kepada Ade mengenai rasanya kembali menjadi penjahit.\n" +
                "\n" +
                "Ade mengaku senang. Sayangnya, setelah itu Ade justru mencibir profesi artis yang dinilainya palsu. Banyak netizen menyoroti perkataan lelaki yang kerap berkata kasar itu."
        txtCelebJudul2.text = "Potret Keseruan Tamara Bleszynski Didatangi Rekan Artis di Warung Makan 'Teh Manis'"
        txtCelebIsi2.text = "Tamara Bleszynski merupakan salah satu artis yang memiliki usaha di bidang kuliner. Dia memiliki usaha warung makannya bernama 'Teh Manis'.\n" +
                "\n" +
                "Terbaru, warung makan Tamara Bleszynski didatangi oleh rekan-rekan artis. Mereka datang ke warung makan Tamara Bleszynski yang berada di Bali.\n" +
                "\n" +
                "Tamara Bleszynski mengunggah momen bersama rekan-rekan artis. Ini potretnya."
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news__celeb, container, false)
    }


}