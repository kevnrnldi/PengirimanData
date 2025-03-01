fun main(){
    PanggilDenganWhen(laptop("axioo"))


//    percobaan("porsche dan bmw z4")
//    percobaan(911)


//    val check = kitaTOString("ya")
//    println(check)




    var percobaan1 = bandingkan("razer")
    var percobaan2 = bandingkan("razer")

    println(percobaan1.hashCode().equals(percobaan2.hashCode()))
    println(percobaan1 == percobaan2)
    println(percobaan1)
    println(percobaan2)
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

class bandingkan(val perusahaan: String){
    override fun hashCode(): Int {
        return perusahaan.hashCode()
    }


    override fun equals(other: Any?): Boolean {
        return when(other){
            is bandingkan -> other.perusahaan.equals( this.perusahaan, ignoreCase = true)
            else -> false
        }
    }
}



