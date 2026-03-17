package oop_112777_TitusEricsonBianto.Week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)

    println(reg1) // Akan mencetak alamat memori (hash code), bukan data
    println("Sama? ${reg1 == reg2}") // Akan menghasilkan False karena alamat memori berbeda
}