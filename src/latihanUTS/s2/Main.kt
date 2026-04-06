package latihanUTS.s2

fun main(){
    println("SISTEM KURIR")

    val paket1 = Paket("ABB", TipeLayanan.EXPRESS)
    val paket2 = Paket("ABC", TipeLayanan.REGULER)
    val paket3 = Paket("", TipeLayanan.EXPRESS)

    val status1 = ProsesKurir(paket1).cek("Nabil")
    val status2 = ProsesKurir(paket2).cek("Daniel")
    val status3 = ProsesKurir(paket3).cek("Jundi")

    fun laporanRekap(Paket: Paket, Status: StatusKirim){
        when(Status){
            is StatusKirim.Terkirim ->
                println("Paket dari resi ${Paket.resi} dengan tipe layanan ${Paket.layanan} telah TERKIRIM ke ${Status.Penerima} dengan ongkir ${Paket.layanan.ongkir}")
            is StatusKirim.Pending ->
                println("Paket dari resi ${Paket.resi} dengan tipe layanan ${Paket.layanan} masih PENDING dengan estimasi ${Status.EstimasiJam} jam. dengan ongkir ${Paket.layanan.ongkir}")
        }
    }
    laporanRekap(paket1, status1)
    laporanRekap(paket2, status2)
    laporanRekap(paket3, status3)

    println("SELURUH TOTAL ONGKIRNYA ADALAH ${DataPusat.TotalOngkir}")

}