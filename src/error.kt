fun bagi( a: Int, b: Int): Int{
    return try {
        a/b
        b/a
    }   catch (e:ArithmeticException){
        println("tidak bisa dibagi dengan 0")
        0
    }finally {
        println("operasi berhasil")
    }
}

fun main(){
    println(bagi(0,10))
}