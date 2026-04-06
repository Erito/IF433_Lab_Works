package oop_112777_TitusEricsonBianto.week03

fun main() {
    val e = Employee("Titus")
    println("SIP")
    e.salary = -5
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar ${e.tax}")
    println("\n\n")



    val w = Weapon("Titus", 5)
    w.damage = 600
    println("Damagenya itu adalah ${w.damage}")
    println("Tiernya adalah: ${w.tier}")
    println("\n")

    val p = Player("Titus")
    // p.xp // error karena xp private
    p.addXp(200)
    p.addXp(60)


}
