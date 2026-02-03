package oop_112777_TitusEricsonBianto.week01

fun main(){
    var name: String = "Titus Ericson"
    var score: Int = 80

    println("Nama: $name , Nilai: $score")

    val grade = when (score){
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")

    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Panjang Id: $idLength")
}

fun calculateStatus(score: Int) = if (score>75) "Lulus" else "Tidak Lulus"