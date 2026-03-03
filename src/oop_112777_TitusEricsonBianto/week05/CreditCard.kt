package oop_112777_TitusEricsonBianto.week05


class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Sukses! Pembayaran Kartu Kredit berhasil. Total penggunaan: $usedAmount")
        } else {
            println("[$accountName] Transaksi ditolak. Melebihi batas limit kartu kredit!")
        }
    }
}