package UTS

interface IBillableTEB {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}