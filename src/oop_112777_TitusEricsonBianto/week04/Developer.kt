package oop_112777_TitusEricsonBianto.week04

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name = "Eufrat", baseSalary = 500000) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}
