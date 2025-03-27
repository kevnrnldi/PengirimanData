package app

fun main(){
//    println("Masukkan Suhu nya: ")
//    var celcius = readLine()?.toDoubleOrNull()
//    if(celcius != null){
//        var farenheit = (celcius * 9/5) + 32
//        println("suhu farenheitnya yaitu : ${farenheit} °F ")
//    } else {
//        println("Input tidak valid! Masukkan angka dengan benar")
//    }
//
//    for(i in 1..10){
//        println(i)
//    }


//    for (i in -21..10)
//    println("woi")
//

    var DuitAbdul: Int? = readLine()?.toIntOrNull()
    var Seico: Int = 1500000
    var casion: Int = 1000000

    if(DuitAbdul != null){
        if (DuitAbdul >= Seico){
            println("abdul membeli jam tangan Seico seharga $Seico dan kembalian duit Abdul ${DuitAbdul - Seico}")
        }   else if (DuitAbdul >= casion) {
            println("abdul membeli jam tangan Casio seharga $casion dan kembalian duit Abdul ${DuitAbdul - casion}")
        }else{
            println("abdul tidak membeli jam apapun sebab duitnya kurang")
        }
    }else{
        println("isila data dengan angka dan jangan kosong")
    }

}