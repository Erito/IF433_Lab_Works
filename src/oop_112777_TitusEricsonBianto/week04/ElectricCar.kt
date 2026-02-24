package oop_112777_TitusEricsonBianto.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand = "Tesla", numberofDoors = 4) {
    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity ")
    }
}