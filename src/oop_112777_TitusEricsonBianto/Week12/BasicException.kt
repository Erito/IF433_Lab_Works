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

fun main(){
    println("===TEST TRY AS EXPRESSION ===")
    val inputString = "123A"
    val result: Int = try{
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException){
        -1
    }
    println("Hasil parsing: $result")
}