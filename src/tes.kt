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
}
