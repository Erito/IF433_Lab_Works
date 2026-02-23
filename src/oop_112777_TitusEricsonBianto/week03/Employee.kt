package oop_112777_TitusEricsonBianto.week03

class Employee {
    var salary: Int = 0
        set(value){
            println("Mencoba set gaji ke: $value")
            this.salary = 5000
        }
}