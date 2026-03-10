package oop_112777_TitusEricsonBianto.Week06

class Smartphone : Camera, Phone {
    override fun turnOn(){
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem Operasi Smartphone berhasil booting")
    }
}