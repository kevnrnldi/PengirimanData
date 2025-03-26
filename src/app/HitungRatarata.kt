package app

fun main(){
    println("masukkan nilai pertama")
    var a = readLine()?.toDouble()
    println("masukkan nilai kedua")
    var b = readLine()?.toDouble()
    println("masukkan nilai ketiga")
    var c = readLine()?.toDouble()
    var total = (a!! + b!! + c!!) /3

    println(total)
}


