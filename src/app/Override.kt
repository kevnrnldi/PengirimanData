package app

fun main(){

    var bangun1 = shape()
    var bangun2 = triangle()
    var bangun3 = rectangle()

//    println(bangun1.shape)
//    println(bangun3.shape)
    println(bangun2.parentCorner)
    println(bangun2.shape)

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
