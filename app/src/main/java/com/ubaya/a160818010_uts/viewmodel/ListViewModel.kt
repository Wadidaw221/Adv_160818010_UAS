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

class ListViewModel(application: Application):AndroidViewModel(application),CoroutineScope {
    val newsLD = MutableLiveData<List<News>>()
    val newsLoadErrorLD = MutableLiveData<Boolean>()
    val loadingLD = MutableLiveData<Boolean>()
    private var job = Job()

    override val coroutineContext:CoroutineContext
            get() = job+Dispatchers.Main

    fun refresh(){
        loadingLD.value = true
        newsLoadErrorLD.value = false
        launch {
            val db = buildDb(getApplication())
            newsLD.value = db.newsDao().selectAllNews()
        }

        fun clearTask(news: News){
            launch {
                val db = buildDb(getApplication())
                newsLD.value = db.newsDao().selectAllNews()
            }
        }
//        val news1 = News("Ini 6 Manfaat Jalan Kaki untuk Kesehatan Ibu Hamil",
//            "Jalan kaki sangat bermanfaat untuk ibu hamil. " +
//                    "Aktivitas jalan kaki bisa menjaga kesehatan ibu hamil dan janin.",
//            "Di usia kehamilan, ibu hamil mungkin tidak disarankan untuk melakukan aktivitas yang terlalu berat. Walaupun begitu, menggerakkan tubuh juga sangat disarankan untuk menjaga kesehatan ibu dan janin.\n" +
//                    "\n" +
//                    "Jalan kaki merupakan salah satu jenis olahraga yang paling aman dan mudah dilakukan oleh ibu hamil. Apalagi, Ibu yang sehat dan bugar tentu akan melahirkan anak yang lebih sehat pula, kuat, dan bahkan lebih cerdas.\n" +
//                    "\n" +
//                    "Manfaat jalan kaki untuk ibu hamil perlu diterapkan secara teratur. Dikutip Liputan6.com dari KlikDokter, olahraga penting dilakukan ibu hamil pada trimester ketiga, agar stamina tetap terjaga saat proses persalinan. Agar lebih aman, konsultasikan dengan dokter kebidanan dan kandungan sebelum kamu melakukannya.\n" +
//                    "\n" +
//                    "Berikut Liputan6.com rangkum tentang manfaat jalan kaki untuk ibu hamil. dari berbagai sumber, Rabu (24/6/2020).")
//        val news2 = News("Jangan Sembarangan Buang Masker",
//                        "Cara membuang masker yang benar penting diterapkan semua orang. " +
//                                "Hal ini tentunya untuk mencegah penyebaran virus Corona COVID-19.",
//                                "1. Lepaskan masker melalui bagian tali dari belakang telinga\n" +
//                                        "\n" +
//                                        "Sebelum menerapkan cara membuang masker yang benar, kamu harus melepaskannya dengan hati-hati. Jangan asal-asalan, sehingga membuat kuman dan percikan air liur malah menyebar. Lepaskan masker melalui bagian tali dari belakang telinga dengan perlahan.\n" +
//                                        "\n" +
//                                        "2. Lipat masker sehingga kuman/droplet ada di bagian dalam lipatan\n" +
//                                        "\n" +
//                                        "Cara membuang masker yang benar dimulai dengan melipat masker terlebih dahulu sebelum setelah kamu melepaskannya. Lipatlah masker ke bagian dalam, sehingga kuman atau droplet ada di bagian dalam lipatan tersebut.\n" +
//                                        "\n" +
//                                        "Hal ini untuk mencegah kuman dan percikan liur menyebar seperti yang telah disebutkan sebelumnya. Dengan melipatnya ke arah dalam, maka bagian masker yang bersih akan tetap berada di luar, sehingga risiko menulari orang lain pun menjadi berkurang.")
//        val news3 = News("Pencuri Jatuh ke Sungai Saat Lari Usai Mobil Curiannya Menabrak Tiang",
//                "Dani Setiawan menabrak tiang Telkom di Jalan Majapahit, Kota Malang, saat membawa lari mobil boks curiannya, Kamis (7/10/2021) pukul 10.00 WIB.\n",
//                        "Setelah menabrak tiang Telkom itu, pelaku lantas lari ke arah Sungai Brantas yang ada di dekat lokasi." +"\n"+"Di sungai itu, dia terjatuh dan harus dievakuasi. " +"\n"+" Sebelum dievakuasi, pelaku yang masih berusia muda itu terduduk lemas di pinggir "+ "\n" + "Sungai Brantas sambil bersandar pada tembok yang menjadi kaki konstruksi jembatan Jalan Majapahit.")
//
//        val newsList:ArrayList<News> = arrayListOf(news1,news2,news3)

    }
}