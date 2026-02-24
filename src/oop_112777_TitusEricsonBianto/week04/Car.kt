package oop_112777_TitusEricsonBianto.week04

open class Car(brand: String, val numberofDoors: Int) : Vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberofDoors pintu dibuka")
    }

    override fun honk(){
        println("Tin Tin! Mobil $brand lewat!!")
    }
    override fun accelerate(){
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
    }
}
