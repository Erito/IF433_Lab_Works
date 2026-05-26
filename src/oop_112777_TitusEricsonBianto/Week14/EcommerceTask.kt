package oop_112777_TitusEricsonBianto.Week14
import java.io.File
import java.io.FileWriter

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")
        file.appendText("$itemName, $finalPrice, $customerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}



interface OrderRepository {
    fun saveOrder(itemName: String, price: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, price: Double, customerType: String) {
        FileWriter("orders.csv", true).use { writer ->
            writer.append("$itemName, $price, $customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}
interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.90
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String, pricing: PricingStrategy) {
        val finalPrice = pricing.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi!")
    }
}