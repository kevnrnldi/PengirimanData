package data



class Mobil (var brand: String? = "Porsche",var year: Int){
//    var brandCar: String? = brand
//    var yearCar: Int = year
}



fun main() {

    val saya = kevin()
    saya.mobil = "porsche"
    saya.name = "kevin"
    saya.jumlahMobil = 12

    saya.sayHello("yuna")
    var fulling = saya.full()
    println(fulling)


}

class kevin(var name: String = "",var mobil: String = "",var jumlahMobil : Int? = 5 ){

    fun sayHello(namaDia: String){
        println("Hallo $namaDia, saya $name")
    }

    fun full() : String{
        return "saya $name punya mobil $mobil dan jumlah mobil saya $jumlahMobil"
    }

}