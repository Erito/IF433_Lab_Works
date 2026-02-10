package oop_112777_TitusEricsonBianto.week02

class Student(val name: String, val nim: String, var major: String){
    init{
        if(nim.length != 5){
            println("WARNING: Objek tercipta dengan nim ($nim) yang tidak valid")
            println("Data mahasiswa $name mungin akan bermasalah di sistem")
        } else{
            println("LOG: Objek Student $name berhasil dialokasikan di memory")
        }
    }
}