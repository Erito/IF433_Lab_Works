package oop_112777_TitusEricsonBianto.Week06

class Smartphone : Camera, Phone {
    override fun turnOn(){
        super<Camera>.turnOn()
        super<Phone>.turnOff()
        println("Sistem Operasi smartphone berhasil booting")
    }
}