package tes

fun main() {
    var arMhs = listOf("Budi", "Susi", "Titus")
    println("Panjang List ${arMhs.size}")
    println(arMhs[1])

    for(a in arMhs) {
        println("Ini bernama $a")
    }


    println("==============MUTABLE==============")
    var arAngka = mutableListOf(10, 30, 40, 20, 90, 100, 15)
    println(arAngka)
    arAngka.add(777)
    println(arAngka)
    arAngka[5] = 123
    arAngka.removeAt(2)
    println(arAngka)


    println("==============SET OF==============")
    var arUrutan = setOf(20, 50, 60, 30, 70, 10, 10)
    println(arUrutan.size)
    println(arUrutan)
    println("Ada anka 40 ga? " + arUrutan.contains(40))

    println("==============SET OF MUTABLE==============")
    var arMakanan = mutableSetOf("Nasi", "Popmie", "Ayam", "Indomie")
    arMakanan.add("Nasi")
    println(arMakanan)
    arMakanan.remove("Nasi")
    println(arMakanan)

    println("==============MAP OF==============")
    var arSiswa = mapOf(
        "Andi" to 89,
        "Ivander" to 90,
        "Titus" to 100
    )
    println(arSiswa)
    println("Nilai si Andi " + arSiswa["Andi"])
    println("banyak data siswa: " + arSiswa.size)
    println("Smua keys: " + arSiswa.keys)
    println("Semua Values: " + arSiswa.values)
    println(arSiswa.keys.elementAt(1))


    println("=======MUTABLE MAP========")
    var arMenu = mutableMapOf(
        "Nasi" to 1000,
        "Popmie" to 1000,
        "Ayam" to 1000,
        "Indomie" to 1000,
        "Ayam" to 1000,
    )
    println(arMenu)
    arMenu["Nasi"] = 1001
    arMenu.remove("Ayam")
    println(arMenu)
    arMenu.put("Udang", 1002)
    println(arMenu)
}