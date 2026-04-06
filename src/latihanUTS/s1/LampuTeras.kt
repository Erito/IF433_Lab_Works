package latihanUTS.s1

class LampuTeras(nama: String, watt: Int): Lampu(nama, watt), SensorCahaya {
    override fun nyalakan() {
        println("Ruang [$nama] berhasil dinyalakan dengan $watt watt")
    }
    override fun autoNyala(){
        println("Lampu di ruangan $nama auto nyala")
    }
}