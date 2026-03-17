package oop_112777_TitusEricsonBianto.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            // Menggunakan Smart Cast untuk mengakses monsterName
            println("Awas! ${event.monsterName} muncul dari semak-semak!")
        }
        is BattleState.LootDropped -> {
            // Menggunakan Destructuring pada properti item (GameItem)
            val (itemName, _, itemRarity) = event.item
            println("Harta Karun! Kamu mendapatkan $itemName dengan rarity $itemRarity!")
        }
        is BattleState.GameOver -> {
            println("Permainan Berakhir: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Silakan beristirahat.")
        }
    }
}