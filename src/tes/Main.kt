package tes

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    print("Masukan nama: ")
    val name = scanner.nextLine()

    print("Masukan nim: ")
    val nim = scanner.nextLine()

    val s1 = Student(name, nim)
}