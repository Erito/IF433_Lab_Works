package UAS_00000112777_TitusEricsonBianto
import java.util.Scanner

fun String.toIdFormatTitus(): String {
    return this.trim().uppercase()
}

fun PetTitus.displayInfoTitus(): String {
    return "$id $name ($type)"
}

fun Double.toRupiahFormatTitus(): String {
    val strValue = this.toLong().toString()
    var result = ""
    for (i in strValue.indices) {
        if (i > 0 && (strValue.length - i) % 3 == 0) {
            result += "."
        }
        result += strValue[i]
    }
    return "Rp $result"
}

fun main() {
    val repositoryTitus = PetRepositoryTitus()
    val storageTitus = FileStorageTitus()
    val scannerTitus = Scanner(System.`in`)

    println("==============================")
    println("SISTEM MANAJEMEN KLINIK PAWS & CARE")
    println("==============================")

    val loadedDataTitus = storageTitus.loadData()
    repositoryTitus.loadInitialData(loadedDataTitus)
    println("[INFO] Memuat data dari patients.csv... (Sukses= ${loadedDataTitus.size} data ditemukan)")

    var isRunningTitus = true
    while (isRunningTitus) {
        println("\nMenu Utama:")
        println("1. Daftarkan Pasien Baru")
        println("2. Lihat Semua Pasien")
        println("3. Cari & Berikan Layanan (Grooming/Vaksin)")
        println("4. Simpan Data & Keluar")
        print("Pilih menu (1-4): ")

        val inputMenuTitus = scannerTitus.nextLine()

        val menuChoiceTitus = try {
            inputMenuTitus.toInt()
        } catch (e: Exception) {
            -1
        }

        if (menuChoiceTitus == -1) {
            println("\n[ERROR] Input tidak valid! Harap masukkan format angka.")
            continue
        }

        when (menuChoiceTitus) {
            1 -> {
                println("\nPENDAFTARAN PASIEN")
                print("Masukkan ID Pasien: ")
                val idTitus = scannerTitus.nextLine().toIdFormatTitus()
                print("Masukkan Nama Hewan: ")
                val nameTitus = scannerTitus.nextLine()
                print("Masukkan Jenis Hewan: ")
                val typeTitus = scannerTitus.nextLine()

                val newPetTitus = PetTitus(idTitus, nameTitus, typeTitus)
                repositoryTitus.add(newPetTitus)
                println("[INFO] Pasien $nameTitus ($idTitus) berhasil didaftarkan!")
            }
            2 -> {
                println("\nDAFTAR SEMUA PASIEN")
                val allPatientsTitus = repositoryTitus.getAll()
                if (allPatientsTitus.isEmpty()) {
                    println("Belum ada pasien terdaftar.")
                } else {
                    allPatientsTitus.forEachIndexed { index, pet ->
                        println("${index + 1}. ${pet.displayInfoTitus()}")
                    }
                }
                println("[INFO] Total: ${allPatientsTitus.size} pasien terdaftar.")
            }
            3 -> {
                println("\nLAYANAN KLINIK")
                print("Masukkan ID Pasien yang dicari: ")
                val searchIdTitus = scannerTitus.nextLine().toIdFormatTitus()

                val foundPetTitus = repositoryTitus.findById(searchIdTitus)

                foundPetTitus?.let { pet ->
                    println("[INFO] Pasien ditemukan: ${pet.displayInfoTitus()}")
                    println("\nPilih Layanan:")
                    println("1. Grooming (Rp 150.000)")
                    println("2. Vaksinasi (Rp 250.000)")
                    print("Pilihan Anda: ")

                    val serviceChoiceTitus = try {
                        scannerTitus.nextLine().toInt()
                    } catch (e: Exception) {
                        0
                    }

                    val serviceTitus: ServiceTitus? = when (serviceChoiceTitus) {
                        1 -> GroomingTitus()
                        2 -> VaccinationTitus()
                        else -> null
                    }

                    serviceTitus?.apply {
                        println("[INFO] Layanan $serviceName berhasil ditambahkan untuk ${pet.name}.")
                        println("Total biaya yang harus dibayar ${calculateCost().toRupiahFormatTitus()}")
                    } ?: println("[ERROR] Pilihan layanan tidak valid.")

                } ?: println("[INFO] Pasien dengan ID $searchIdTitus tidak ditemukan.")
            }
            4 -> {
                println("\n[INFO] Menyimpan data ke patients.csv...")
                val isSavedTitus = storageTitus.saveData(repositoryTitus.getAll())
                if (isSavedTitus) {
                    println("[INFO] Data berhasil disimpan.")
                } else {
                    println("[ERROR] Gagal menyimpan data.")
                }
                println("Terima kasih telah menggunakan Paws & Care!")
                isRunningTitus = false
            }
            else -> {
                println("\n[ERROR] Pilihan tidak ada di menu.")
            }
        }
    }
}