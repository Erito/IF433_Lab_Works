package oop_112777_TitusEricsonBianto.week04

fun main(){
    println("---Testing Vehicle---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.accelerate()
    generalVehicle.honk()

    println("\n---Testing Car---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.accelerate()
    myCar.honk()
}