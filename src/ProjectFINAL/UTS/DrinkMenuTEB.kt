package UTS

class DrinkMenuTEB(
    name: String,
    menuCodeParameter: String,
    basePriceParameter: Double,
    val isLargeSize: Boolean
) : CateringMenuTEB(name, menuCodeParameter, basePriceParameter) {

    override fun calculateSubtotal(quantity: Int): Double {
        val finalBasePrice = if (isLargeSize) basePrice + 5000.0 else basePrice
        return finalBasePrice * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val sizeTag = if (isLargeSize) "(Large)" else "(Reguler)"
        println("Minumannya  : $menuCode - $name $sizeTag")
        println("Quantitynya : $quantity cup")
        println("Subtotal    : Rp ${calculateSubtotal(quantity)}\n")
    }
}