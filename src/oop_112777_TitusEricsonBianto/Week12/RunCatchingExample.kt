package oop_112777_TitusEricsonBianto.Week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    val safeValue = result.getOrElse { -1 }
    println("Safe value: $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered value: $recovered")

    runCatching{
        "100".toInt()
    }.onSuccess {
        v -> println("Berhasil dikonversi: $v")
    }.onFailure {
        e -> println("Gagal konversi: ${e.message}")
    }
}