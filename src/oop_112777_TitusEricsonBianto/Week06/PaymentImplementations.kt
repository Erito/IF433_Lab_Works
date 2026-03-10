package oop_112777_TitusEricsonBianto.Week06

class Gopay : PaymentMethod{
    override fun pay(amount: Double){
        println("Processing Rp$amount via Gopay Server")
    }
}

class CreditCard : PaymentMethod{
    override fun pay(amount: Double){
        println("Processing Rp$amount via CreditCard Server")
    }
}