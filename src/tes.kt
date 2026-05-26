
class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, aktivitas: Double): Double {
        return (quiz * 0.3) + (aktivitas * 0.7)
    }

    fun hitung_nilai_akhir(utsMhs: Double, uasMhs: Double, tugasMhs: Double, jnsKur: jenis_kurikulum): Double {
        return jnsKur.hitung_nilai_bobot(utsMhs, uasMhs, tugasMhs)
    }
}

class db_khs {
    fun simpan_na_db(nim: String, nama: String, nilaiAkhir: Double): String {
        return "KHS $nim nama $nama dapat nilai $nilaiAkhir"
    }

    fun load_db(nim: String): String {
        return "Berhasil load data $nim"
    }
}

interface jenis_kurikulum {
    fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double
}

class kurikulum_2013 : jenis_kurikulum {
    override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}

class kurikulum_merdeka : jenis_kurikulum {
    override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.2) + (uas * 0.5) + (tugas * 0.3)
    }
}

fun main() {
    val khsMhs = proses_khs()
    val nilaiTugas = khsMhs.hitung_nilai_tugas(83.57, 76.45)
    val naMhs1: Double = khsMhs.hitung_nilai_akhir(85.67, 70.40, nilaiTugas, kurikulum_2013())
    val naMhs2: Double = khsMhs.hitung_nilai_akhir(85.67, 70.40, nilaiTugas, kurikulum_merdeka())

    val dbMhs = db_khs()
    val statSimpan1: String = dbMhs.simpan_na_db("123", "Titus", naMhs1)
    val statSimpan2: String = dbMhs.simpan_na_db("123", "Titus", naMhs2)


    println(statSimpan1)
    println(statSimpan2)
}