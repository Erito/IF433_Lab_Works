package oop_112777_TitusEricsonBianto.Week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )
    val parser = ApiParser()
    for (raw in rawApiData) {
        println("Memproses raw data: ${raw["name"] ?: "Unknown Name"}")
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                parser.checkout(it)
            } ?: println("-> WARNING: Tipe produk tidak dikenali (di-skip).")
        } catch (e: IllegalArgumentException) {
            println("-> ERROR DITANGKAP: ${e.message}")
        }
        println("---------------------TEB------------------------")
    }
}