package UAS_00000112777_TitusEricsonBianto
interface DataRepositoryTitus<T> {
    fun add(item: T)
    fun getAll(): List<T>
    fun findById(id: String): T?
}
interface ServiceTitus {
    val serviceName: String
    fun calculateCost(): Double
}
data class PetTitus(val id: String, val name: String, val type: String)

class PetRepositoryTitus : DataRepositoryTitus<PetTitus> {
    private val items = mutableListOf<PetTitus>()
    fun filterPatients(predicate: (PetTitus) -> Boolean): List<PetTitus> {
        return items.filter(predicate)
    }

    override fun add(item: PetTitus) {
        items.add(item)
    }

    override fun getAll(): List<PetTitus> {
        return items
    }

    override fun findById(id: String): PetTitus? {
        val results = filterPatients { it.id == id }
        return results.firstOrNull() // Null Safety
    }

    fun loadInitialData(newItems: List<PetTitus>) {
        items.clear()
        items.addAll(newItems)
    }
}

class GroomingTitus : ServiceTitus {
    override val serviceName = "Grooming"
    override fun calculateCost(): Double = 150000.0
}

class VaccinationTitus : ServiceTitus {
    override val serviceName = "Vaksinasi"
    override fun calculateCost(): Double = 250000.0
}