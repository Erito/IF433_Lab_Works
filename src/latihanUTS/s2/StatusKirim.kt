package latihanUTS.s2

sealed class StatusKirim {
    data class Terkirim(val Penerima: String): StatusKirim()
    data class Pending(val EstimasiJam: Int): StatusKirim()
}
