package latihanUTS.s1

fun main(){
    val listLampu: List<Lampu> = listOf(
        LampuTeras("Ruangan Teras", 50),
        LampuTamu("Ruangan Tamu", 80, "Biru")
    )
    for(i in listLampu){
        i.nyalakan()
        if(i is LampuTeras){
            i.autoNyala()
        }
    }
}