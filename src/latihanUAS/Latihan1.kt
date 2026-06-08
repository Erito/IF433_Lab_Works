package latihanUAS

interface ITrackable{
    fun updateStatus(newStatus: String)
}

abstract class DeliverableItem(val id: String, val weight: Double): ITrackable{
    var status: String = "Pending"
    var courierName: String? = null
    override fun updateStatus(newStatus: String){
        status = newStatus
    }
}


class Document(id: String, weight: Double, val isConfidential: Boolean ): DeliverableItem(id, weight)
class Parcel(id: String, weight: Double, val isFragile: Boolean ): DeliverableItem(id, weight)

class DeliveryRepository<T>{
    private val items = mutableListOf<T>()
    fun addItem(item: T){
        items.add(item)
    }
    fun getAllItems(): List<T>{
        return items
    }
}

fun DeliverableItem.printDetails(){
    val courier = this.courierName?: "Belum Dialokasikan"
    println("[$id] Berat: [$weight]kg | Status: [$status] | Kurir: [$courierName]")
}

fun main() {
    val repo = DeliveryRepository<DeliverableItem>()
    val doc1 = Document("DOC-001", 0.5, true).apply {
        courierName = "Budi"
    }
    val parcel1 = Parcel("PAR-001", 2.5, true).apply {
        courierName = "Andi"
    }
    val parcel2 = Parcel("PAR-002", 10.0, false).apply {

    }

    repo.addItem(doc1)
    repo.addItem(parcel1)
    repo.addItem(parcel2)
    doc1.updateStatus("Delivered")

    println("--SEMUA PENGIRIMAN--")
    repo.getAllItems().forEach { item ->
        item.printDetails()
    }

    println("\n--DAFTAR PAKET PENDING--")
    val pendingItems = repo.getAllItems().filter { it.status == "Pending" }
    pendingItems.let { list ->
        if (list.isEmpty()) {
            println("Tidak ada paket pending.")
        } else {
            list.forEach { it.printDetails() }
        }
    }
}
