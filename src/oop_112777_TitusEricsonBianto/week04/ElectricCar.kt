package oop_112777_TitusEricsonBianto.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand = "", numberofDoors = 0) {
    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity ")
    }
}