package oop_112777_TitusEricsonBianto.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Balance: ${coin.balance}")
    }

    println("\n--- Data Transaksi ---")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX1001", 0.1))
    txRepo.add(Transaction("TX1002", 2.5))

    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
}