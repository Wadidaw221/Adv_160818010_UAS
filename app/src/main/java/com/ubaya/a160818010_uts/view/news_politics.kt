package com.ubaya.a160818010_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ubaya.a160818010_uts.R
import kotlinx.android.synthetic.main.fragment_news_politics.*


class news_politics : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtPoliticsJudul1.text = "PAN Siapkan Zulkifli Hasan dan Soetrisno Bachir untuk Pilpres 2024"
        txtPolitkIsi1.text = "Partai Amanat Nasional (PAN) menyiapkan kader terbaik untuk jadi calon Presiden di Pemilu 2024. Mereka adalah Ketua Umum PAN Zulkifli Hasan dan Ketua Dewan Kehormatan PAN Soetrisno Bachir.\n" +
                "\n" +
                "\"Kami menyiapkan kadernya ada Mas Tris, mungkin ada Bang Zul,\" kata Wakil Ketua Umum PAN Yandri Susanto kepada merdeka.com, Kamis (7/10).\n" +
                "\n" +
                "Meski mengutamakan kader, kata Yandri, PAN tak menutup ruang untuk melirik tokoh potensial dan mengusungnya di Pilpres 2024. Beberapa tokoh itu diantaranya, Menteri BUMN Erick Thohir, Gubernur Jawa Barat Ridwan Kamil, Gubernur Jawa Timur Khofifah Indar Parawansa, Gubernur DKI Jakarta Anies Baswedan dan Gubernur Jawa Tengah Ganjar Pranowo.\n" +
                "\n" +
                "\"PAN itu sangat terbuka dengan Emil, dengan Anies terbuka, Khofifah, Ganjar dan tokoh-tokoh lain termasuk tokoh-tokoh partai politik,\" ujar Yandri.\n" +
                "\n" +
                "Yandri menegaskan, PAN melihat kebutuhan bangsa dan negara dalam mengusung capres. Sehingga PAN terbuka untuk mengusung tokoh baik dari internal atau eksternal.\n" +
                "\n" +
                "\"Kalau PAN sudah terlatih dalam hal koalisi ini, terbuka, kita dari internal ada Bang Hatta, kita juga pernah eksternal dukung Prabowo dua kali, pernah dukung SBY,\" terang Ketua Komisi VIII DPR RI itu.\n" +
                "\n" +
                "Di internal PAN, lanjut Yandri, forum Rakernas telah memberikan mandat kepada Zulkifli Hasan untuk memutuskan urusan Capres-Cawapres, termasuk mitra koalisi.\n" +
                "\n" +
                "\"Kita serahkan kepada ketua umum untuk mengkomunikasikan dengan para pihak apa itu pasangan calon, partai pengusung atau pertimbangan lain itu sudah diputuskan, diserahkan kepada bang Zul sebagai ketua umum,\" tutup Yandri. "
        txtPoliticsJudul2.text = "Demokrat Yakin Saksi Faktanya Bantah Klaim Kubu Moeldoko di PTUN"
        txtPolitkIsi2.text = "Tim hukum DPP Partai Demokrat yakin saksi fakta yang mereka hadirkan di sidang Pengadilan Tata Usaha Negara (PTUN), Jakarta, Kamis (7/10), dapat membatalkan klaim yang diajukan oleh pengacara kubu Moeldoko.\n" +
                "\n" +
                "Saksi-saksi fakta yang dihadirkan oleh Partai Demokrat akan menerangkan situasi pada Kongres Kelima Partai Demokrat pada 2020 dan pertemuan di Sibolangit, Deli Serdang, Sumatera Utara pada Maret 2021, kata Kuasa Hukum Partai Demokrat Heru Widodo sebelum masuk ruang sidang di PTUN Jakarta.\n" +
                "\n" +
                "\"Nanti akan kami adu dengan saksi-saksi (kubu Moeldoko.),\" ucap Heru.\n" +
                "\n" +
                "\"Insya Allah, kami tambah optimistis, kalau kemarin kami optimistis, sekarang kami tambah optimistis bahwa gugatan (kubu Moeldoko) tidak mempunyai kekuatan hukum,\" ujar Heru yang memberi keterangan bersama Juru Bicara DPP Partai Demokrat Herzaky Mahendra Putra.\n" +
                "\n" +
                "Kuasa Hukum Demokrat lainnya, Hamdan Zoelva, sebelumnya menyampaikan saksi fakta yang diajukan pihaknya akan menunjukkan pertemuan di Sibolangit tidak memenuhi syarat untuk disebut sebagai kongres luar biasa.\n" +
                "\n" +
                "'Upaya hukum apa pun yang dilakukan oleh Moeldoko tidak akan berhasil selama dia tidak dapat membuktikan daftar nama yang hadir di KLB Deli Serdang. Kami mempunyai fakta hukum bahwa ketua DPD dan ketua DPC Partai Demokrat yang sah dan tercatat dalam SIPOL yang dikelola oleh KPU RI tidak ada yang hadir saat KLB ilegal itu diselenggarakan,\" tutur Hamdan sebagaimana dikutip dari siaran resmi DPP Partai Demokrat.\n" +
                "\n" +
                "SIPOL atau Sistem Informasi Partai Politik merupakan pusat data KPU yang menyimpan data-data mengenai partai politik dan daftar pengurus resmi.\n" +
                "\n" +
                "Dalam sidang, Kuasa Hukum Demokrat berencana menghadirkan empat saksi fakta, antara lain Anggota Komisi III DPR RI Hinca Pandjaitan, Bupati Karawang Celica Nurrachadiana, dan Anggota Komisi IV DPR RI Suhardi Duka.\n" +
                "\n" +
                "Majelis Hakim PTUN Jakarta, yang dipimpin oleh Enrico Simanjuntak melanjutkan sidang untuk nomor perkara 150/G/2021/PTUN.JKT.\n" +
                "\n" +
                "Kubu Moeldoko mendaftarkan gugatan itu ke PTUN Jakarta pada 25 Juni 2021. Isi gugatan di antaranya meminta Majelis Hakim membatalkan SK Menteri Hukum dan HAM yang mengesahkan perubahan AD/ART dan daftar kepengurusan Partai Demokrat pimpinan Agus Harimurti Yudhoyono."
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_politics, container, false)
    }


}