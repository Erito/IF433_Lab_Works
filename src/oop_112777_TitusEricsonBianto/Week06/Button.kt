package oop_112777_TitusEricsonBianto.Week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol $name berhasil diklik!")
    }
}