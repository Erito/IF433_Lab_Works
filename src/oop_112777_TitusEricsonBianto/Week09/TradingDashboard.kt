package oop_112777_TitusEricsonBianto.Week09

fun main() {
    // 2. Inisialisasi Data Uji
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 2.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 50, -10.0, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 10, 8.4, "CLOSED"),
        TradeLog("XRPUSDT", "SHORT", 20, 0.0, "CLOSED")
    )

    // 3. Pipeline 1: Ekstraksi Data Valid (Filter)
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    // 4. Pipeline 2: Memisahkan Winning Trades
    val winningTrades = closedTrades.filter { it.roe > 0 }

    // 5. Pipeline 3: Memisahkan Losing Trades
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    // 6. Pipeline 4: Analisis Koin Profit Tertinggi
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // 7. Pipeline 5: Analisis Koin Loss
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // 8. Pipeline Tambahan: Ekstraksi Unik
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    // 9 & 10. Menampilkan Dashboard Utama
    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }
    worstPerformersString.forEach { println(it) }
    println("\nUnique Pairs Traded: $uniquePairs")
}