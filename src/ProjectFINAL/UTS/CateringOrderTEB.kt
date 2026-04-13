package UTS

class CateringOrderTEB(val customer: CustomerTEB) {
    var status: OrderStatusTEB = OrderStatusTEB.WAITING_LIST
    private val orderItems: MutableList<Pair<CateringMenuTEB, Int>> = mutableListOf()
    fun addMenuToOrder(menu: CateringMenuTEB, qty: Int) {
        orderItems.add(Pair(menu, qty))
    }

    fun printInvoice() {
        var grandTotal = 0.0
        for ((index, item) in orderItems.withIndex()) {
            val menu = item.first
            val qty = item.second
            menu.printMenuDetails(qty)
            grandTotal += menu.calculateSubtotal(qty)
        }

        println("============== INVOICE ================")
        println("Nama Pelanggan    : ${customer.name} (${customer.phone})")
        println("Alamat Pengiriman : ${customer.deliveryAddress}")
        println("Status Pesanan    : $status")
        println("Grand Total       : $grandTotal")
        println("=================TEB===================")

    }
}