package oop_112777_TitusEricsonBianto.Week12

fun divide(a: Int, b: Int): Int {
    try{
        return a / b
    } catch (e: ArithmeticException) {
        println("Errot: ${e.message}")
        return -1
    } finally{
        println("Division attempt finished")
    }
}