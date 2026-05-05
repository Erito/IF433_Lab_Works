fun String.DasarExtenson():String{
    return "Halo $this"
}

fun String.RubahHurudBesarDepan():String{
    var hasil = ""
    hasil = this.split(" ").joinToString(" "){
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return hasil
}

fun String.tentukanKelulusan(Nilai:Int):String{
    var Hasil = ""
    if(Nilai > 70){
        Hasil = "Lulus"
    } else{
        Hasil = "Ga llus"
    }
    return this + " " + Hasil
}

fun String?.CekNulldanEmpty():String{
    var hasil = ""
    if(this == null || this.isEmpty()) {
        hasil = "Ga boleh null atau Empty"
    } else{
        hasil = "Password kamu: $this"
    }

    return hasil
}

data class Manusia(var nama:String, var umur:Int)
//class Manusia(){
//    var nama:String = ""
//    var umur:Int = 0
//}

fun main(){
    var passwordKamu:String? = "09452"
    println(passwordKamu.CekNulldanEmpty())

    println("Grade Kamu".tentukanKelulusan(71))

    println("Ya ".repeat(5))
    println("HI".DasarExtenson())


    //Tanpa extension func
    val nama1 = "Budi Sihombing"
    println(nama1.uppercase())

    //dengan extension function
    println("budi kurniawan".RubahHurudBesarDepan())

    var huruf:String = "UMN"
    val hasilKampus = huruf.let{
        if(it == "UMN "){
            println("Kampus saya")
        } else {
            println("Bukan Kampus saya")
        }
    }
    println(hasilKampus)


    var nilaiKamu = 70.run {
        if(this >= 70){
            println("Lulus")
        } else{
            println("Ga Lulus")
        }
    }

    val pekerjaan = with("Mahasiswa"){
        if(this == "Mahasiswa"){
            println("Pelajar")
        } else{
            println("Pekerja")
        }
    }

    val orang = Manusia("Titus", 50).apply{
        nama = "Budi"
        umur = 20
    }
    println("Nama kamu ${orang.nama} umur kamu ${orang.umur}")

    var deretAngka = mutableListOf<Int>(1, 2, 3, 4)
    deretAngka.also{
        println("Sebelum $deretAngka")
    }.add(5)
    println("Setelah $deretAngka")

}
