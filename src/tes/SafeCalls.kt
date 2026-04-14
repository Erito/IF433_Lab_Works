package tes

class Alamat(val kota:String?)

class Mahasiswa(val address: Alamat)

fun main(){
    val mhs1 = Mahasiswa(Alamat("Tangerang"))
    val mhs2 = Mahasiswa(Alamat(null))

    println("Mahasiswa1 = ${mhs1.address.kota}")
    println("Mahasiswa1 = ${mhs2.address.kota}")

    val tetapAlamat = Alamat(null)
    val defaultAlamat = tetapAlamat.kota?.let {
        adres -> "Alamatnya $adres"
    } ?: "Alamat kamu kosong"
    println("Alamat kamu ${defaultAlamat}")
}
