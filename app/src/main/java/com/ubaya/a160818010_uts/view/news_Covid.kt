package com.ubaya.a160818010_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ubaya.a160818010_uts.R
import kotlinx.android.synthetic.main.fragment_news__covid.*


class news_Covid : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtCovidJudul1.text = "Waktu yang Tepat untuk Vaksinasi Usai Terinfeksi Covid-19"
        txtCovidIsi1.text = "Virus SARS-CoV-2 masih beredar belum selesai mencapai tingkat vaksinasi herd-imunity. Demi menanggulangi pandemi Covid-19, masyarakat dihimbau untuk mendapatkan vaksin secara penuh atau dua tahap.\n" +
                "\n" +
                "Bahkan bagi para penyintas maupun orang yang pernah terinfeksi. Penyintas Covid-19 merupakan sebutan bagi orang yang mampu bertahan hidup melawan. Selain itu disebut pula kumpulan orang-orang yang sembuh dari Covid-19.\n" +
                "\n" +
                "Seseorang yang pernah terinfeksi kemudian sembuh, biasanya telah mendapatkan antibodi dari infeksi virus yang mereka alami sebelumnya.\n" +
                "\n" +
                "Melansir dari laman Instagram resmi Kementerian Kesehatan (Kemenkes), penyintas Covid-19 bisa menerima vaksin tiga bulan setelah dinyatakan sembuh. Hal ini merujuk pada rekomendasi PAPDI dan ITAGI, serta melihat dari respon tubuh masing-masing orang terhadap virus."
        txtCovidJudul2.text = "147 Warga Desa di Tapanuli Utara Positif Covid-19 Setelah Acara Pesta"
        txtCovidIsi2.text = "Sedikitnya 147 warga di Dusun Hutagurgur, Desa Aek Tangga, Kecamatan Garoga, Kabupaten Tapanuli Utara, Sumatera Utara, terkonfirmasi positif Covid-19. Bupati Tapanuli Utara, Nikson Bababan mengatakan, desa tersebut telah memberlakukan lockdown sejak satu minggu lalu.\n" +
                "\n" +
                "\"Jadi kami lockdown desa itu, tidak bisa masuk dan keluar. Untuk kebutuhan pokoknya tetap kami suplai. Termasuk kebutuhan medisnya,\" kata Nikson, Minggu (23/5).\n" +
                "\n" +
                "Nikson melanjutkan, mayoritas warga di desa itu positif Covid-19 tanpa gejala. Lockdown di desa itu akan diberlakukan hingga 28 Mei 2021.\n" +
                "\n" +
                "\"Tapi kalau belum sembuh semua tetap kami tutup. Nanti 14 hari kami swab lagi, yang tidak sembuh tetap isolasi mandiri,\" ungkapnya.\n" +
                "\n" +
                "Menurutnya, penularan Covid-19 terhadap ratusan orang di desa itu terjadi usai warga menghadiri sebuah pesta di wilayah tersebut.\n" +
                "\n" +
                "\"Iya jadi ada pesta di sana, kemudian ada yang positif, terus kami lacak. Kami disiplin melakukan tracing-nya secara menyeluruh. Ini membuat agak tinggi kasusnya. Saya sampaikan ke Kepala Puskesmas, Kepala Dinas Kesehatan, dan Satgas Covid-19, kalau ada yang positif harus dilakukan tracing semua,\" ucapnya.\n" +
                "\n" +
                "Seperti diketahui, ratusan orang di desa itu yang positif Covid-19 terdiri dari 2 anak-anak berusia 1-5 tahun. 22 anak-anak usia 6-12 tahun. 19 remaja usia 13-18 tahun. 68 orang usia 19-40. 18 orang usia 41-59, dan 18 orang berusia lebih dari 60 tahun. Dari jumlah itu, sekitar 66 orang dinyatakan telah negatif setelah swab test.\n" +
                "\n" +
                "Kasus positif Covid-19 di Kabupaten Tapanuli Utara sampai Jumat (21/5) tercatat ada 1.570 kasus. Di mana sebanyak 1.105 orang dinyatakan telah sembuh. Sementara, 441 orang masih dirawat dan 24 lainnya meninggal dunia. "
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news__covid, container, false)
    }


}