package com.example.luwe

object FoodData {
    private val foodName = arrayOf(
        "Sate",
        "Soto",
        "Nasi Goreng",
        "Nasi Uduk",
        "Nasi Padang",
        "Ayam Goreng",
        "Bakmi",
        "Gudeg",
        "Rawon",
        "Pecel Lele",
    )

    private val foodPrice = intArrayOf(
        15000,
        12000,
        10000,
        7000,
        20000,
        17000,
        9000,
        7000,
        15000,
        15000,
    )

    private val foodDesc = arrayOf(
        "Sate adalah makanan khas Indonesia yang terdiri dari berbagai macam varian, bisa dari daging yang dipilih, bahan yang dipakai untuk bumbu, hingga tusukan yang digunakan",
        "Soto adalah kuliner khas nusantara berupa hidangan berkuah yang terbuat dari kaldu daging dan sayuran Ada dua jenis soto yang populer di Indonesia, yakni soto ayam atau daging dan soto mie.",
        "Nasi goreng sendiri adalah makanan berupa nasi yang digoreng bersama kecap dan bumbu lain yang kemudian diaduk-aduk sampai nasi berubah menjadi kecokelatan sebagai tanda kecap telah meresap dan menyebar ke semua nasi.",
        "nasi uduk yang mana berasnya harus diaron terlebih dahulu dengan air santan, daun salam, daun jeruk, serai, dan laos. Setelah selesai diaron nasi uduk kemudian dikukush ingga matang sehingga menghasilkan cita rasa nasi yang gurih dan beraroma harum.",
        "Nasi Padang adalah nasi putih yang disajikan dengan berbagai macam lauk pauk khas Indonesia. Padang merujuk pada ibu kota provinsi Sumatra Barat, kampung halaman orang Minangkabau.",
        "Ayam goreng adalah hidangan Asia Tenggara yang merupakan ayam yang digoreng dalam minyak goreng. Dalam dunia internasional, istilah ayam goreng merujuk kepada ayam goreng gaya Nusantara (Indonesia, Malaysia, Brunei, dan Singapura).",
        "Bakmi sendiri dibuat dari bahan utama tepung terigu atau bakmi kuning. Penyajian bakmi biasa dilakukan dalam mangkuk bersama isian, kuah, dan tak lupa sambalnya.",
        "Komposisi bahan utama untuk membuat gudeg antara lain nangka muda, telur rebus, tahu, tempe, dan ayam. Tak jarang saat penyajiannya gudeg juga dimakan bersama kulit sapi segar atau sambal goreng krecek.",
        "rawon ini mempunyai bentuk seperti sup daging dengan kuah yang berwarna cokelat pekat cenderung hitam. Warna kuah pada rawon dihasilkan dari penggunaan bumbu bernama kluwak",
        "Pecel lele atau pecek lele di Indonesia adalah nama sebuah makanan khas Jawa yang terdiri dari ikan lele dan sambal tomat. Biasanya yang dimaksud adalah ikan lele yang digoreng kering dengan minyak lalu disajikan dengan sambal tomat dan lalapan. Lalapan biasa terdiri dari kemangi, kubis, menti",
    )

    private val foodImg = intArrayOf(
        R.drawable.sate,
        R.drawable.soto,
        R.drawable.nasi_goreng,
        R.drawable.nasi_uduk,
        R.drawable.nasi_padang,
        R.drawable.ayam_goreng,
        R.drawable.bakmi,
        R.drawable.gudeg,
        R.drawable.rawon,
        R.drawable.pecel_lele,

    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.price = foodPrice[position]
                food.desc = foodDesc[position]
                food.img = foodImg[position]
                list.add(food)
            }
            return list
        }
}