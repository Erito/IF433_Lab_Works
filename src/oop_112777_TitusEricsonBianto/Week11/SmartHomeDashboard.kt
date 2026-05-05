package oop_112777_TitusEricsonBianto.Week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acUnit)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }
    with(homeDevices) {
        println("Total perangkat: ${this.size}")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total Daya: $totalPower")

    homeDevices.forEach {
        println(it.diagnose())
    }
}