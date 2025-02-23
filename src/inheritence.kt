fun main(){

    var mobil1 = ferrari("Ferrari 458", "Ferrari")
    var mobil2 = MercedesBenz("C63", "Mercedes Benz")

    mobil1.panggil("Mercedes Benz SLS")
    mobil2.panggil("SL65")

    var mobil3 = porsche("Gallardo")
    mobil3.panggil("Huracan STO")

    var mobil4 = brand("Aston Martin Vantage","Aston Martin")
    mobil4.panggil("Aston Martin DB9")

}


open class brand(val carName: String,val carBrand: String){

    constructor(carName: String): this(carName, "Lamborghini"){

    }


   open fun panggil(carName: String){
        println("mobil saya $carName, dan saya juga punya ${this.carName} brand dari mobil saya yaitu $carBrand")
    }
}


open class ferrari(carName: String,carBrand: String) : brand(carName, carBrand){
    override fun panggil(carName: String){
        println("mobil saya yaitu $carName, lalu saya juga punya mobil project yaitu ${this.carName} brand dari kedua mobil saya yaitu $carBrand")
    }
}


open class MercedesBenz(carName: String,carBrand: String) : ferrari(carName,carBrand){
    final override fun panggil(carName: String) {
        println("mobilku $carBrand tipenya yaitu ${this.carName} dan $carName")
    }
}
//
//class dragon(carName: String,carBrand: String) : MercedesBenz(carName,carBrand){
//    override fun panggil(carName: String) {
//        super.panggil(carName)
//    }
//}


class porsche(carName: String) : brand(carName) {
    final override fun panggil(carName: String) {
        println("mobil saya pasti $carBrand lalu tipenya yaitu ${this.carName} dan $carName")
    }
}