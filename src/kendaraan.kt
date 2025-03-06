import data.Mobil

fun main (){
    var mobil1 = mobil ("Porsche 911 Gt4")
    var mobil2 = motor("Kawasaki Z1000")
    mobil1.mesin("Inline-6")
    mobil1.info()
    mobil1.jalan()
    mobil2.mesin("Inline-4")
    mobil2.info()
    mobil2.jalan()

}


abstract class kendaraan(var nama: String, var roda: Int){
    abstract fun mesin( mesinnya: String)

    fun info(){
        println("$nama memiliki $roda roda")
    }
}

interface bisaDikendarai {
    fun jalan()
}


class mobil( nama: String) : kendaraan(nama, 4), bisaDikendarai{
    override fun mesin(mesinnya: String){
        println("mesin $nama : $mesinnya")
    }


    override fun jalan() {
        println("$nama bisa berjalan")
    }
}

class motor( nama: String) : kendaraan(nama, 2), bisaDikendarai{
    override fun mesin( mesinnya: String){
        println("mesin $nama : $mesinnya")
    }


    override fun jalan() {
        println("$nama bisa berjalan")
    }
}



