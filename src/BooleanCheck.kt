fun main(){
    println("Masukkan angka :")
    var masukkanTeks = readLine()?.toDoubleOrNull()

    if (masukkanTeks != null) {
        if (masukkanTeks > 0) {
            println("Angka ini adalah positif")
        } else if (masukkanTeks < 0) {
            println("Angka ini adalah negatif")
        } else {
            println("angka ini adalah nol")
        }
    }else{
        println("Input tidak valid, Masukkan angka")
    }
}