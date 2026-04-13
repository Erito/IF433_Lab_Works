package UTS

abstract class CateringMenuTEB(
    val name: String,
    menuCodeParameter: String,
    basePriceParameter: Double
) : IBillableTEB {

    var menuCode: String = ""
        set(value) {
            field = value.uppercase()
        }
        get() = "UMN-$field"

    var basePrice: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Error!!! Harga ga valid! karena inputnya: $value")
                field = 25000.0
            }
        }

    init {
        this.menuCode = menuCodeParameter
        this.basePrice = basePriceParameter
    }
}