package app

fun main(){
    println("Masukkan Suhu nya: ")
    var celcius = readLine()?.toDoubleOrNull()
    if(celcius != null){
        var farenheit = (celcius * 9/5) + 32
        println("suhu farenheitnya yaitu : ${farenheit} °F ")
    } else {
        println("Input tidak valid! Masukkan angka dengan benar")
    }
}