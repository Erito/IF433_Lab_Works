package oop_112777_TitusEricsonBianto.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Mini RPG Battle ---")
    print("Masukan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukan base damage Hero: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(name = heroName, baseDamage = baseDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println()
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) {
                enemyHp = 0
            }
            println("HP musuh tersisa: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas! Damage: $enemyDamage")
                hero.takeDamage(enemyDamage)
                println("HP ${hero.name} tersisa: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid.")
        }
    }

    println()
    if (hero.isAlive() && enemyHp <= 0) {
        println("Pemenang: ${hero.name}")
    } else if (!hero.isAlive() && enemyHp > 0) {
        println("Pemenang: Musuh")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
