package oop_112777_TitusEricsonBianto.Week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("Smart CCTV $name dinyalakan")
        startRecord()
    }

    override fun turnOff() {
        println("Smart CCTV $name dimatikan")
    }

    override fun startRecord() {
        println("Smart CCTV $name mulai merekam")
    }
}
