package com.ansela.skincareproject.data

import com.ansela.skincareproject.R

object SkincareDataObject {

    private val skincareNama = arrayOf(
        "somethink",
        "the body shop",
        "wardah",
        "the ordinary",
        "sari ayu",
        "skin dewi",
        "kahf",
        "sensatia",
        "lacoco",
        "avoskin",
    )
    private val skincareHarga = arrayOf(
        "100.000",
        "200.000",
        "300.000",
        "250.000",
        "290.000",
        "400.000",
        "280.000",
        "500.000",
        "270.000",
        "50.000",
    )
    private val skincareManfaat = arrayOf(
        "Somethinc  Niacinamide , Moisture Sabi Beet Serum merupakan serum dengan kandungan niacinamide dan Sabi Beet yang membantu mencerahkan secara maksimal, memperbaiki tekstur kulitSomethinc  Niacinamide , Moisture Sabi Beet Serum merupakan serum dengan kandungan niacinamide dan Sabi Beet yang membantu mencerahkan secara maksimal, memperbaiki tekstur kulit.",
        "efektif untuk memperlambat tanda-tanda penuaan kulit. Selain itu, moisturizer juga menjaga kelembapan kulit yang dapat mencegah munculnya garis dan kerutan dini, serta dapat membantu meminimalkan munculnya kerutan yang sudah ada.",
        "Toner ini bisa membersihkan pori-pori yang terdalam, karena memiliki kandungan zinc gluconate, aloe vera extract dan witch hazel extract. Selain membersihkan pori-pori dan menghilangkan beruntusan, toner ini juga bisa melembapkan sekaligus mengontrol minyak.",
        " dapat membersihkan dan mengangkat sel kulit mati. Sel kulit mati yang menumpuk dapat menyebabkan pori-pori tersumbat dan berpotensi menimbulkan masalah kulit lainnya di masa mendatang salah satunya dapat membuat kulit wajah terlihat kusam.",
        "berfungsi untuk mengeringkan jerawat dan mengatur keseimbangan minyak wajah, serta mencegah timbulnya jerawat. Produk ini diperkaya dengan kandungan belerang halus, pegagan, dan bahan lainnya yang dapat membantu mengurangi jerawat dan merawat kulit berjerawat.",
        "serum yang berguna untuk mencerahkan, menenangkan kemerahan, serta mengatasi kerutan. Jadi, ketika Anda memilih tipe produk ini, pastikan khasiatnya sesuai dengan masalah kulit yang ingin diatasi.",
        "Membuat kulit terasa lembab dan halus,Membersihkan kulit dari kotoran hingga ke pori-pori,Membantu melawan jerawat,Membuat wajah bebas minyak hingga 12 jam.",
        "Sensatia Botanicals Tea Tree & Lemon Facial Toner adalah toner wajah yang cocok untuk jenis kulit berminyak dan cenderung berjerawat karena memiliki kandungan antibakteri dan mampu membantu mengurangi minyak berlebih. Kandungan lainnya pun sangat bermanfaat seperti minyak kulit lemon yang dapat membersihkan kulit.",
        "serum yang berguna untuk mencerahkan, menenangkan kemerahan, serta mengatasi kerutan. Jadi, ketika Anda memilih tipe produk ini, pastikan khasiatnya sesuai dengan masalah kulit yang ingin diatasi.",
        " Tea Tree & Lemon Facial Toner adalah toner wajah yang cocok untuk jenis kulit berminyak dan cenderung berjerawat karena memiliki kandungan antibakteri dan mampu membantu mengurangi minyak berlebih. Kandungan lainnya pun sangat bermanfaat seperti minyak kulit lemon yang dapat membersihkan kulit.",
    )
    private val skincareImages = intArrayOf(
        R.drawable.avoskin,
        R.drawable.somethink,
        R.drawable.kahf,
        R.drawable.lacoco,
        R.drawable.sensatia,
        R.drawable.sariayu,
        R.drawable.skin_dewi,
        R.drawable.wardah,
        R.drawable.the_body_shop,
        R.drawable.the_ordinary,

    )

    val listData: ArrayList<SkincareData>
    get() {
        val list = arrayListOf<SkincareData>()
        for (position in skincareNama.indices){
            val skincare = SkincareData()
            skincare.nama = skincareNama[position]
            skincare.harga = skincareHarga[position]
            skincare.manfaat = skincareManfaat[position]
            skincare.photo = skincareImages[position]
            list.add(skincare)
        }
        return  list
    }

}