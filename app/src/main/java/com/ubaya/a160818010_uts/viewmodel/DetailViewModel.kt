package com.ubaya.a160818010_uts.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.a160818010_uts.model.News

class DetailViewModel: ViewModel() {
    val newsLD = MutableLiveData<News>()
    fun Details() {
        val news1 = News(
            "Ini 6 Manfaat Jalan Kaki untuk Kesehatan Ibu Hamil",
            "Jalan kaki sangat bermanfaat untuk ibu hamil. " +
                    "Aktivitas jalan kaki bisa menjaga kesehatan ibu hamil dan janin.",
            "Di usia kehamilan, ibu hamil mungkin tidak disarankan untuk melakukan aktivitas yang terlalu berat. Walaupun begitu, menggerakkan tubuh juga sangat disarankan untuk menjaga kesehatan ibu dan janin.\n" +
                    "\n" +
                    "Jalan kaki merupakan salah satu jenis olahraga yang paling aman dan mudah dilakukan oleh ibu hamil. Apalagi, Ibu yang sehat dan bugar tentu akan melahirkan anak yang lebih sehat pula, kuat, dan bahkan lebih cerdas.\n" +
                    "\n" +
                    "Manfaat jalan kaki untuk ibu hamil perlu diterapkan secara teratur. Dikutip Liputan6.com dari KlikDokter, olahraga penting dilakukan ibu hamil pada trimester ketiga, agar stamina tetap terjaga saat proses persalinan. Agar lebih aman, konsultasikan dengan dokter kebidanan dan kandungan sebelum kamu melakukannya.\n" +
                    "\n" +
                    "Berikut Liputan6.com rangkum tentang manfaat jalan kaki untuk ibu hamil. dari berbagai sumber, Rabu (24/6/2020)."
        )
        newsLD.value = news1
    }
}