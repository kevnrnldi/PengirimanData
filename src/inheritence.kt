fun main(){

    var mobil1 = ferrari("Ferrari 458", "Ferrari")
//    var mobil2 = porsche("Porsche 911", "Porsche")

    mobil1.panggil("Mercedes Benz SLS")
//    mobil2.panggil("BMW Z4 GT 3")

    var mobil3 = porsche("Gallardo")
    mobil3.panggil("911")


}


open class brand(val carName: String,val carBrand: String){

    constructor(carName: String): this(carName, "Lamborghini"){

    }


    fun panggil(carName: String){
        println("mobil saya $carName, dan saya juga punya ${this.carName} brand dari mobil saya yaitu $carBrand")
    }
}

class ferrari(carName: String,carBrand: String) : brand(carName, carBrand)
class porsche(carName: String) : brand(carName)