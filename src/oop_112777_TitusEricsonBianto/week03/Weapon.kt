package oop_112777_TitusEricsonBianto.week03

class Weapon(
    val name: String,
    damage: Int,
    tier: String
)
{
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING: damage tidak boleh negatif. Nilai tidak diubah.")
                return
            } else if(value > 1000){
                println("WARNING: Terlalu overpower weh")
                field = 1000
            } else{
                field = value
                println("Damage ningkat sebesar $field")
            }
        }

    init {
        this.damage = damage
    }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
