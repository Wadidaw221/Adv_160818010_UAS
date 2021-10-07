package com.ubaya.a160818010_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ubaya.a160818010_uts.R
import kotlinx.android.synthetic.main.fragment_news__trending.*


class news_Trending : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtJudulTrending1.text = "Netizen Ramai Keluhkan Koneksi IndiHome-Telkomsel"
        txtIsiTrending1.text = "Jakarta - Netizen ramai-ramai mengeluhkan koneksi IndiHome dan Telkomsel pada malam ini, Minggu (19/9/2021). Alhasil, topik \"IndiHome\" dan \"Telkomsel\" jadi trending topic di lini masa media sosial Twitter.\n" +
                "Berdasarkan pantauan detikINET di lini masa, netizen mengaku kesulitan untuk berselancar di internet, bahkan di antara mereka sampai tidak bisa mengakses layanan sama sekali.\n" +
                "\n" +
                "Baca artikel detikinet, \"Netizen Ramai Keluhkan Koneksi IndiHome-Telkomsel\" selengkapnya https://inet.detik.com/telecommunication/d-5730865/netizen-ramai-keluhkan-koneksi-indihome-telkomsel.\n"
        txtTrendingJudul2.text = "Bupati Garut: Stok Vaksin Terbatas, Banyak Vaksinator Menganggur"
        txtIsiTrending2.text = "Merdeka.com - Kabupaten Garut saat ini diketahui sudah masuk level 2 pemberlakuan pembatasan kegiatan masyarakat (PPKM). Dengan level tersebut, sejumlah kegiatan yang tadinya tidak diperkenankan menjadi mulai dibolehkan.\n" +
                "\n" +
                "Beberapa hal yang dilaksanakan di Kabupaten Garut selama PPKM level 2 adalah pembelajaran tatap muka (PTM) terbatas. Hal lainnya juga, di Garut sejumlah tempat wisata sudah mulai kembali dibuka dengan aturan ketat.\n" +
                "\n" +
                "Selain pelonggaran di banyak lini, Bupati Garut Rudy Gunawan juga terus gencar melakukan vaksinasi kepada masyarakat sebagai upaya untuk mencapai herd immunity. Namun persoalan yang dihadapi adalah pasokan vaksin yang masih terbatas.\n" +
                "\n" +
                "\"Jadi dulu vaksin mengejar orang sekarang orang mengejar vaksin, Alhamdulillah. Cuman sekarang kesulitannya adalah dropingnya tidak menentu. Jadi kadang-kadang kami dikasih 5000-2000 tiap hari, ada tapi kan tidak stok,\" kata Rudy.\n" +
                "\n" +
                "Ia mengaku bahwa antusias warga dalam vaksinasi cukup tinggi. Pihaknya pun melakukan berbagai upaya agar kegiatan vaksinasi tidak menjadi klister baru dalam penyebaran Covid-19.\n" +
                "\n" +
                "Berikut petikan wawancara khusus merdeka.com dengan Bupati Garut Rudy Gunawan."
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news__trending, container, false)
    }


}