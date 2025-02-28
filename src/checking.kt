fun main(){
    PanggilDenganWhen(laptop("axioo"))

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