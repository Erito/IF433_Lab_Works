package oop_112777_TitusEricsonBianto.Week08

fun main(){
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")
}