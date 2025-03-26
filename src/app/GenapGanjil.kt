package app

fun main(){
    var nilai = readLine()?.toIntOrNull()

    if(nilai != null) {
        if (nilai % 2 == 0) {
            println("Angka ini adalah Genap")
        } else if(nilai % 2 != 0){
            println("Angka ini adalah Ganjil")
        }
    }else {
        println("Input tidak valid, masukkan Angka")
    }
}