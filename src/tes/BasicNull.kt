package tes

class profile_page(val idProfile: String?, val statusOnline: String?){
    fun ganti_foto(filePhoto: String?){
        println("Foto kamu adalah ${filePhoto}")
    }
}

fun main(){
    var nama:String? = "Wirawan"
    nama = null
    println("Nama kamu ${nama}")
    val profile = profile_page("12345", null)
    println("id = ${profile.idProfile}, dengan status ${profile.statusOnline}")

    profile.ganti_foto(null)
}