package LectureTes

class MyCar {
    public var warna:String = "abu" //ini skill
    public var kecepatan:Int = 50

    init { // ini constructure juga
        if(kecepatan > 70){
            println("Cepet banget")
        } else{
            println("Kurang Cepat")
        }
    }

    constructor(speed:Int=10, brake:Double=1.3){
        kecepatan = speed
        println("kecepatan = $kecepatan dan $brake")
    }

    fun mulai_jalan(){
        println("Kecepatan $warna luar biasa")
    }
}

fun main(){
    val myCar = MyCar(100, 1.8 );
//    myCar.kecepatan();
//    myCar.mulai_jalan() = "Merah"

    println("Kecepatan adalah ${myCar.warna}")


}