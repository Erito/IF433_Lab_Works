package tes

class Student(
    val name: String,
    val nim: String
){
    init{
        if(nim.length != 5){
          println("Ini ga valid $nim")
          println("Ini data dari ${name}")
        } else {
            println("LOG: Objek student bisa disimpen")
        }
    }
}