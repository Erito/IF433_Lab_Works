package oop_112777_TitusEricsonBianto.week05


class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Sukses! Pembayaran EWallet berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName] Saldo tidak cukup. Saldo saat ini: $balance")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up berhasil sebesar $amount. Saldo saat ini: $balance")
    }
}