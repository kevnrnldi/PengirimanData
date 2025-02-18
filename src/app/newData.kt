package app

import data.Mobil

fun main (){
    val cayman = Mobil("porsche", 2024)
    cayman.yearCar = 2026

    val gtr = Mobil("nissan", 2021)



    println(cayman.brandCar)
    println(cayman.yearCar)
    println(gtr.brandCar)
    println(gtr.yearCar)



    val game1 = game("Elden ring", "Soulslike")
  

}


class game(var nama: String, var genre: String){
    init {
        println("saya suka bermain game $genre contohnya seperti $nama")
    }
}