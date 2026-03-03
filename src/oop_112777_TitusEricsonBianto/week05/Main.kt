package oop_112777_TitusEricsonBianto.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()
        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdekteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("====================================")
    }

    println("=============TUGAS 1=================")



    val mathHelper = MathHelper()
    val luasPersegi = mathHelper.hitungLuas(5)
    val luasPersegiPanjang = mathHelper.hitungLuas(4, 6)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi (sisi = 5): $luasPersegi")
    println("Luas Persegi Panjang (panjang = 4, lebar = 6): $luasPersegiPanjang")
    println("Luas Lingkaran (jari-jari = 7.0): $luasLingkaran")



    println("============TUGAS 2============")
    val eWallet = EWallet("MyOvo", 50000.0)
    val creditCard = CreditCard("BCA Card", 100000.0)
    val paymentList: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("=== Memproses Pembayaran Awal (Rp 75,000) ===")
    for (payment in paymentList) {
        payment.processPayment(75000.0)
        if (payment is EWallet) {
            println("--> Sistem mendeteksi EWallet gagal transaksi. Melakukan Auto Top-Up...")
            payment.topUp(50000.0)
            println("--> Mencoba ulang pembayaran...")
            payment.processPayment(75000.0)
        }
        println("--------------------------------------------------")
    }
}