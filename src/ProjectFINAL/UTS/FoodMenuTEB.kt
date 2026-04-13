package UTS

class FoodMenuTEB(
    name: String,
    menuCodeParameter: String,
    basePriceParameter: Double
) : CateringMenuTEB(name, menuCodeParameter, basePriceParameter) {

    val packagingFee: Double = 3000.0
    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        println("Makananya   : $menuCode - $name")
        println("Quantitynya : $quantity porsi")
        println("Subtotal    : Rp ${calculateSubtotal(quantity)}\n")
    }
}