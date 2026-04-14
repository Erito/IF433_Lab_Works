package tes

fun main(){
    val nama:String? = null
    try{
        println("Nama kamu $nama")
        println("Panjang huruf ${nama!!.length}")
    } catch (e: NullPointerException){
        println("Ada error, ini prsan errornya ${e.message}")
    }

    val mixedData: List<Any?> = listOf(1, "Budi", 10, null)
    for(item in mixedData){
        val hasil = item as? String
        if(hasil != null){
            println(hasil)
        } else{
            println("Ini tuh $item")
        }
    }
}