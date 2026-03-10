package oop_112777_TitusEricsonBianto.Week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout . . .")
    method.pay(amount)
}


fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()


    val pay1 = Gopay()
    val pay2 = CreditCard()
    println("\n=======TESTING CHECKOUT =======")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val button = Button("Start")
    button.click()

    println("\n=======TUGAS========\n")
    val SL = SmartLamp("Satu", "Ruang Tamu")
    val SS = SmartSpeaker("Dua","Google Nest Dapur")
    val SC = SmartCCTV("Tiga", "Ezviz Garasi")


}