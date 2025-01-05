fun main (): Unit {
    mencoba(
        pekerjaan = "programmer",
        tinggal = "singapore", mobil = "porsche"
    )
   println(dikalidua(10))

   // val values = arrayOf(11,12,13,14)
    val result = varagh(10,10,10,10,10)
    println(result)
}

fun dikalidua (a: Int): Int = a * 2 * 2

fun varagh (ini: Int, vararg values: Int):Int{
    var total = 0
    for (value in values){
        total += value
    }
    return total
}

fun fungsiKedua (a: Int, b: Int): Int {
    var total = a + b
    return total
}


fun mencoba(pekerjaan: String,mobil: String,tinggal: String){
    println(" wah mobil $mobil kerja mu $pekerjaan dan kamu tinggal di $tinggal")
    var result =fungsiKedua(10,10)


}