package oop_112777_TitusEricsonBianto.Week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double){
        if(amount < 0){
            throw IllegalArgumentException("Amount must be positive")
        }
        if(amount > 0){
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance ")
    }
}