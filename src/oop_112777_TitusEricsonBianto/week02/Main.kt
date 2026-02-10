package oop_112777_TitusEricsonBianto.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System. `in`)

    println("--- Aplikasi PMB UMN ---")
    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukan NIM (Wajib 5 karakter): ")
    val nim = scanner.nextLine()

    scanner.nextLine() //Bersihkan buffer newline (penyakit klasik Scanner)

    //Validasi di sisi pemanggil (Main)
    if(nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter")
    } else{
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai")
    }
}