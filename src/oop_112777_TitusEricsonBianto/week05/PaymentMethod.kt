package oop_112777_TitusEricsonBianto.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}