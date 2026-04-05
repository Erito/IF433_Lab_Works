package oop_112777_TitusEricsonBianto.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1,
){
    fun calculateFine(): Int{
        return if(loanDuration > 3){
            (loanDuration - 3) * 2000
        } else{
            0
        }
    }
}