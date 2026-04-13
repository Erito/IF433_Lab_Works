package UTS
import java.util.Scanner

//TEB => Titus Ericson Bianto

fun main() {
    println("SISTEM UMN CATERING")
    println("[Database Setup] Menambahkan Nasi Goreng Spesial")
    val nasiGoreng = FoodMenuTEB("Nasi Goreng Spesial", "nsg01", -15000.0)


    println("[Database Setup] Harga diperbaiki jadi Rp ${nasiGoreng.basePrice}")

    val ayamBakar = FoodMenuTEB("Ayam Bakar Madu", "aym02", 35000.0)
    val esTeh = DrinkMenuTEB("Es Teh Lemon", "lem01", 8000.0, isLargeSize = true)

    val menuCatalog: List<CateringMenuTEB> = listOf(nasiGoreng, ayamBakar, esTeh)


    val scanner = Scanner(System.`in`)

    println("\nINPUT DATA PELANGGAN")
    println("----------------TEB-------------------")
    print("Masukkan Nama Pelanggan    : ")
    val custName = scanner.nextLine()

    print("Masukkan Nomor HP          : ")
    val custPhone = scanner.nextLine()

    print("Masukkan Alamat Pengiriman : ")
    val custAddress = scanner.nextLine()

    val customer = CustomerTEB(custName, custPhone, custAddress)
    val order = CateringOrderTEB(customer)


    var isOrdering = true
    while (isOrdering) {
        println("\n------KATALOG MENU------")
        for (i in menuCatalog.indices) {
            println("${i + 1}. ${menuCatalog[i].name}")
        }
        println("0. [SELESAI & CHECKOUT]")

        print("Pilih Nomor Menu: ")
        val menuIndexInput = scanner.nextInt()

        if (menuIndexInput == 0) {
            println("Memproses Checkout...\n")
            isOrdering = false
        } else if (menuIndexInput in 1..menuCatalog.size) {
            print("Masukkan Jumlah Pesanan: ")
            val qty = scanner.nextInt()

            val selectedMenu = menuCatalog[menuIndexInput - 1]
            order.addMenuToOrder(selectedMenu, qty)
            println("Berhasil menambahkan pesanan!")
        } else {
            println("Error!!! pilihan ngawur!")
        }
    }

    order.status = OrderStatusTEB.COOKING
    order.printInvoice()
}