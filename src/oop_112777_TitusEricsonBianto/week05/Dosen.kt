package oop_112777_TitusEricsonBianto.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKSPS")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}