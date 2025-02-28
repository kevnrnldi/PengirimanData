fun main(){
    PanggilDenganWhen(laptop("axioo"))


    percobaan("porsche dan bmw z4")
    percobaan(911)


    val check = kitaTOString("ya")
    println(check)
}

fun Panggil(any: Any){
    if(any is handphone){
        println("hp, ${any.brand}")
    } else if(any is laptop) {
        println("laptop ${any.brand}")
    } else {
        println("entah")
    }
//
//    println(any)
}

fun PanggilDenganWhen(any: Any){
    when (any) {
        is handphone -> println("hp, ${any.brand}")
        is laptop -> println("laptop ${any.brand}")
        else -> println("entah")
    }
//
//    println(any)
}


class handphone(var brand: String)
class laptop( var brand: String)


fun percobaan(mobil: Any){
    val checkKonversi : String? = mobil as? String
    println(checkKonversi)
}


class kitaTOString(var apakahBerhasil: String){
    override fun toString(): String {
        return "berhasil? $apakahBerhasil"
    }
}

