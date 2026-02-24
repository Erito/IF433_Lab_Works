package oop_112777_TitusEricsonBianto.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work(){
        println("$name sedang bekerja")
    }

    open fun calculateBonus(){
        val calc = baseSalary * 10/100
        println("$calc hasilnya")
    }
}