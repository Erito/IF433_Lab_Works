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

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)

    println(data1) // Otomatis readable format: DataUser(name=Alice, age=22)
    println("Sama? ${data1 == data2}") // True (Structural Equality) karena isinya sama

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")
}