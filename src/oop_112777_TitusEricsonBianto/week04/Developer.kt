package oop_112777_TitusEricsonBianto.week04

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name = name, baseSalary = baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}
