package latihanUAS

interface ITrackable {
    fun updateStatus(newStatus: String)
}

abstract class DeliverableItem(val id: String, val weight: Double):ITrackable {
    var status: String = "Pending"
    var courierName: String? = null
    override fun updateStatus(newStatus: String) {
        status = newStatus
    }
}

class Document(id: String, weight: Double, val isConfidential: Boolean) : DeliverableItem(id, weight)
class Parcel (id:String, weight: Double, val isFragile: Boolean):DeliverableItem(id, weight)

class DeliveryRepository<T>{
    private val items = mutableListOf<T>()
    fun addItem(item: T){
        items.add(item)
    }
    fun getAllItems(): List<T> {
        return items
    }
}

fun DeliverableItem.printDetails(){
    val courier = this.courierName?: "Belum dialokasikan"
    println("[ID] $id Berat: $weight kg, Status: $status, Kurir: $courier")
}

fun main(){
    val repo = DeliveryRepository<DeliverableItem>()
    val doc1 = Document("A1", 50.00, true).apply {
        courierName = "Titus"
    }
    val parcel1 = Parcel("A2", 50.0, true).apply{
        courierName = "Claresta"
    }
    val parcel2= Parcel("A3", 50.0, false). apply {

    }

    repo.addItem(parcel1)
    repo.addItem(parcel2)
    repo.addItem(doc1)

    doc1.updateStatus("Delivered")
    parcel1.updateStatus("Delivered")

    println("Semua Pengiriman")
    repo.getAllItems().forEach{
        item -> item.printDetails()
    }

    println("Paket yang Pending")
    val pendingPaket = repo.getAllItems().filter{
        it.status == "Pending"
    }

    pendingPaket.let {
        yas ->
        if(yas.isEmpty()){
            println("Tidak ada Paket Penting")
        } else{
            yas.forEach { it.printDetails()}
        }
    }
}