
fun pembagian(){
    try{
        val a = 10
        val b = 5
        val hasil = a/b
        println("Hasil bagi: $hasil")
    }catch(e: Exception){
        println("Ada Error:  " + e.message)
    }finally {
        println("Selesai try catch")
    }
}

fun cek_tipe_variable(){
    var angka:Int = try {
        Integer.parseInt("123")
    }catch (e: Exception){
        println("ada Error:  " + e.message)
        6767
    }
    println(angka)
}

fun cek_nilai(nilai:Int){
    if(nilai<0){
        throw IllegalArgumentException("Masa Nilai minus")
    } else if(nilai > 100){
        println("Masa Nilai lebih besar dari 100")
    } else{
        println("Nilai kamu adalah " + nilai)
    }
}

class cek_saldo_rekening(val pengeluaran: Int, val saldo:Int ):
    Exception("Saldo kamu sisa $saldo dan pengeluaran: $pengeluaran")
class transaksi_keuangan(){
    fun narik_uang(balance:Int, totalBelanja:Int){
        if(totalBelanja> balance){
            try{
                throw cek_saldo_rekening(totalBelanja, balance)
            } catch (e:Exception){
                println(e.message)
            }
        } else{
            println("Transaksi berhasil, sisa saldo ${balance - totalBelanja}")
        }
    }
}

fun multiple_catch(input:String){
    try{
        val angka:Int = input.toInt()
        val hitungBagi: Int = angka/0
        println("Hasil bagi $hitungBagi")
    } catch(e: NumberFormatException){
        println("GBISA BAGI HURUF " + e.message)
    } catch(e: ArithmeticException){
        println("Masa pembagian pake 0: ${e.message}")
    } catch (e:Exception){
        println("Ada errpr di multiple catch: ${e.message}")
    }
}

sealed class BankException(pesan:String): Exception("Error di Bank EXCEPTION " + pesan)
class cek_saldo(val pengeluaran:Int): BankException("Pengeluaran kamu $pengeluaran dari saldo")
class cek_input(val transaksi:Int): BankException("Transaksi kamu masa minus $transaksi")

fun transaksi_belanja(saldoKamu: Int, jajanKamu: Int):Int{
    if(jajanKamu < 0){
        throw cek_input(jajanKamu)
    } else if(saldoKamu < jajanKamu){
        throw cek_saldo(jajanKamu)
    }
    return saldoKamu - jajanKamu
}

fun main(){
    println("Testing dulu")
    pembagian()
    cek_tipe_variable()

    try {
        cek_nilai(101)
    } catch(e:Exception){
        println("Wow ada error di niai: " + e.message)
    }

    val trx = transaksi_keuangan()
    trx.narik_uang(1200, 1000)

    multiple_catch("as^d")
    println("")

    runCatching {
        transaksi_belanja(1000, 1200)
    }.onSuccess {println("Belanja Berhasil , sisa saldo: $it")}.onFailure {println(it)}
}
