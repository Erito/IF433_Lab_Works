package oop_112777_TitusEricsonBianto.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) return
        val beforeLevel = level
        xp += amount
        if (level > beforeLevel){
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}