package LectureTes

//Encapsulation
open class Karyawan {
    private var nama:String = "Titus Ericson";
    private var gaji:Int = 0;
    protected var namaPacar:String = "Jessy Valentine";

    public var umur:Int = 0
        set(value) {
            if(value < 0){
                println("Masa umur minuss")
            } else{
                field = value;
            }
        }
        get(){
            return field;
        }

    public fun set_nama(namakamu:String){
        if(namakamu.length == 0){
            println("Namakamu is empty");
        } else{
            this.nama=namakamu;
        }
    }

    public fun get_nama():String{
        return this.nama + " okkk" ;
    }

    public fun setGji(gajis: Int){
        if(gajis < 0){
            println("MASA GAJI MINUS");
        } else{
            this.gaji=gajis;
        }
    }

    public fun getGji():Int{
        return this.gaji;
    }
}

class DataPribadi:Karyawan(){
    fun ambilDataPacar():String{
        return this.namaPacar;
    }
}


fun main(){
//    var kry = Karyawan();
//    kry.set_nama("Ucok Adam");
//    kry.setGji(-100)
//
//    println("Karna itu Gajinya Jadi " + kry.getGji())

    var dp = DataPribadi();
    dp.umur = 15;
    dp.setGji(-100)
    println("Nama Pacar: " + dp.ambilDataPacar())
    println("Nama Karyawan: " + dp.get_nama())
    println("Umurnya: " + dp.umur)

}