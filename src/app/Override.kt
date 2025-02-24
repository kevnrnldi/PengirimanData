package app

fun main(){

    var bangun1 = shape()
    var bangun2 = triangle()
    var bangun3 = rectangle()

//    println(bangun1.shape)
//    println(bangun3.shape)
    println(bangun2.parentCorner)
    println(bangun2.shape)



    var orang1 = biodata("Kevin","Otomotif")
    println(orang1.balance)
   var orang2 = businessman("KevinR",2000000000)
    println(orang2.balance)
}

open class shape(){
    open val shape: Int = -1
}

open class triangle() : shape(){
     override var shape: Int = 4
    val parentCorner: Int = super.shape
}


class rectangle() : triangle() {
    override var shape: Int = 3
}



open class biodata(var name: String, var hobi: String, var balance: Int) {
    constructor(name: String,hobi: String) : this(name,hobi,20000000)
    constructor(name: String) : this(name, "Otomotif")
}

class programmer : biodata {
    constructor(name: String) : super(name,"Coding")
}


class businessman : biodata {
    constructor(name: String, balance: Int): super(name,"Bisnis", balance)
    constructor(name: String): super(name,"games")
}