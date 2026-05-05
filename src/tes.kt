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

fun main(){
    println("HI".DasarExtenson())


    //Tanpa extension func
    val nama1 = "Budi Sihombing"
    println(nama1.uppercase())

    //dengan extension function
    println("budi kurniawan".RubahHurudBesarDepan())
}