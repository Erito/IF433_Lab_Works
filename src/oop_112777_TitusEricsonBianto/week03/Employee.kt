package oop_112777_TitusEricsonBianto.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value){
            if (value < 0){
                println("ERROR: Gaji gaboleh negatif! sehingga set jadi 0")
                field = value
            } else{
                field = value
            }
        }
}