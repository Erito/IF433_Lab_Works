package oop_112777_TitusEricsonBianto.week01

fun main(){
    val gameTitle = "Titus Hero"
    val price = 900000

    val finalPrice = DiscCalculate(price)

    println("Game: $gameTitle, Harga Akhir: $finalPrice")
}

fun DiscCalculate(price: Int): Int =
if (price > 500_000){
    (price * 0.8).toInt()
} else{
    (price * 0.8).toInt()
}