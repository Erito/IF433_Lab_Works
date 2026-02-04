package oop_112777_TitusEricsonBianto.week01

fun main(){
    val gameTitle = "Titus Hero"
    val price = 900000
    val userNote: String? = null
    val finalPrice = DiscCalculate(price)

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun DiscCalculate(price: Int): Int =
if (price > 500_000){
    (price * 0.8).toInt()
} else{
    (price * 0.8).toInt()
}

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, note: String?) {
    println("=== SteamKW Receipt ===")
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")

    val notePrint = note ?: "Tidak ada Catatan"
    println("Catatam     : $notePrint")
}