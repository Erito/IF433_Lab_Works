package oop_112777_TitusEricsonBianto.Week08

fun main(){
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")


    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

//    // Langkah 2: Filter dengan as? (Checkpoint 7)
//    for (item in mixedData) {
//        val text = item as? String
//        // Hanya cetak jika cast sukses (text tidak null)
//        text?.let {
//            println("Ditemukan teks: ${it.uppercase()}")
//        }
//    }
//
//    // Langkah 3: Safe Cast + Elvis Fallback (Checkpoint 8 & 9)
//    val someObject: Any = 100 // Tipe aslinya Integer
//    // Coba cast ke String. Jika gagal (null), ganti dengan "Unknown String"
//    val safeString = someObject as? String ?: "Unknown String"
//    println("Hasil cast fallback: $safeString")

}