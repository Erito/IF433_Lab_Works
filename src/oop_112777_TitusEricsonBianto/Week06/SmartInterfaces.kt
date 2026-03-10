package oop_112777_TitusEricsonBianto.Week06

interface SmartDevice {
    abstract val id: String
    abstract val name: String
}

interface Switchable {
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable {
    abstract fun startRecord()

    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}
