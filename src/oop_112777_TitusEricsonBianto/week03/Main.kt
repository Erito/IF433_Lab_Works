package oop_112777_TitusEricsonBianto.week03

fun main() {
    val e = Employee("Titus")
    println("SIP")
    e.salary = -5
    e.salary = 5000000 // 5juta
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar ${e.tax}") // 500.000
}