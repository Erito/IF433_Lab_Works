package oop_112777_TitusEricsonBianto.week04

class Manager(name: String, baseSalary: Int): Employee(name = name, baseSalary = baseSalary){
    override fun work(){
        super.work()
        println("$name sedang memimpin rapat divisi")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500_000
    }
}
