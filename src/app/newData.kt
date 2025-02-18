package app

import data.Business
import data.Mobil

fun main (){
//    val cayman = Mobil("porsche", 2024)
//    cayman.yearCar = 2026
//
//    val gtr = Mobil("nissan", 2021)
//
//
//
//
//    println(cayman.brandCar)
//    println(cayman.yearCar)
//    println(gtr.brandCar)
//    println(gtr.yearCar)




    val game2 = Game("God Of War")
    game2.tahunku = 2022
    game2.tema = "Action"
   val game1 = Game("Elden ring", "Soulslike")
   val game3 = Game("forza horizon 6", "motorsport", 2026)




    var bisnis1 = Business("AutoSport", "Otomotif")
    var bisnis2 = Business("Breads", "Makanan", 2025)

    println(bisnis1.namaBisnis)
    println(bisnis2.namaBisnis)

    bisnis1.tampil()
    bisnis2.tampil()

}


class Game( nama: String,  genre: String,  tahun: Int){
    init {
        println("saya suka bermain game $nama rilis tahun $tahun dan bergenre $genre")
    }

    constructor(nama: String,genre: String) : this(nama,genre,2025){
        println("secondary constructor pertama")
    }

    constructor(nama: String) : this(nama,""){
        println("secondary constructor kedua")
    }


    var tahunku: Int = tahun
    var tema : String = genre

}