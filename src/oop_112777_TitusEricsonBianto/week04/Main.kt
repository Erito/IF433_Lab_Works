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

    println("\n---Testing ElectricCar---")
    val el = ElectricCar("Tesla", 4, 20)
    el.openTrunk()
    el.accelerate()

    println("\n---Testing Employee---")
    val m = Manager("Titus", 100000)
    val d = Developer("Eufrat", 500000, "C")
    m.work()
    d.work()
    d.calculateBonus()
    println("Ini salarynya: ${m.calculateBonus()}")
    println("Ini salarynya: ${d.calculateBonus()}")

}