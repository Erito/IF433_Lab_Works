package oop_112777_TitusEricsonBianto.Week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id = id, name = name, warrantyMonths = warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id = id, name = name, size = size)
            }
            else -> {
                null
            }
        }
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }
        val paymentResponse = JavaPaymentService.processPayment(id)
        val transactionId = paymentResponse!!
        println("Berhasil Checkout! Transaction ID: $transactionId")
    }
}