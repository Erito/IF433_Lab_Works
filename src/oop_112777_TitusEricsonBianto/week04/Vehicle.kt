package oop_112777_TitusEricsonBianto.week04

class Vehicle {
    open class Vehicle(val brand:String){
        var speed: Int = 0
        open fun accelerate(){
            speed += 10
            println("$brand melaju. Kecepatan: $speed km/hari")
        }

        open fun honk(){
            println("Beep Beep")
        }
    }
}