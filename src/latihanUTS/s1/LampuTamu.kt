package latihanUTS.s1

class LampuTamu(nama: String, watt: Int, val warna: String): Lampu(nama, watt) {
    override fun nyalakan() {
        println("Ruang [$nama] berhasil dinyalakan dengan $watt watt")
    }

    fun ubahWarna(){
        println("Ruangan ini telah berubaah warna menjadi $warna")
    }

}