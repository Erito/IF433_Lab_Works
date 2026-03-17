package oop_112777_TitusEricsonBianto.Week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan!")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}