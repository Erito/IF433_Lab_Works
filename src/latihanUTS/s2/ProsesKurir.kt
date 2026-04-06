package latihanUTS.s2

class ProsesKurir(val p: Paket) {
    fun cek(Penerima: String): StatusKirim {
        DataPusat.TotalOngkir += p.layanan.ongkir

        return if(p.resi.isNotEmpty()){
            StatusKirim.Pending(50)
        } else{
            StatusKirim.Terkirim("Titus")
        }
    }
}