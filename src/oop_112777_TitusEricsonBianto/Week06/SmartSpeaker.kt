package oop_112777_TitusEricsonBianto.Week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify")
    }
}