package UAS_00000112777_TitusEricsonBianto

import java.io.File

class FileStorageTitus {
    private val fileName = "patientsTitus.csv"
    //Datanya ada di sebelum folder yahh pak :)

    fun loadData(): List<PetTitus> {
        val list = mutableListOf<PetTitus>()
        try {
            val file = File(fileName)
            if (file.exists()) {
                file.bufferedReader().useLines { lines ->
                    lines.forEach { line ->
                        val parts = line.split(",")
                        if (parts.size == 3) {
                            list.add(PetTitus(parts[0], parts[1], parts[2]))
                        }
                    }
                }
            }
        } catch (e: Exception) {
            println("[ERROR] Gagal membaca file: ${e.message}")
        }
        return list
    }

    fun saveData(patients: List<PetTitus>): Boolean {
        return try {
            File(fileName).bufferedWriter().use { out ->
                patients.forEach {
                    out.write("${it.id},${it.name},${it.type}\n")
                }
            }
            true
        } catch (e: Exception) {
            false
        }
    }
}