package app

fun main(){
    println("Masukkan bilangan bulat positif: ")
    val n = readLine()?.toIntOrNull()


    var factorial = 1
    var i = 1

    if (n != null) {
        if (n >= 0 ) {
            while (i <= n) {
                factorial *= i
                i++
            }
            println(factorial)
        } else {
            println("Masukkan Angka")
        }
    }else {
        println("Masukkan nilai berupa Angka")
    }
}