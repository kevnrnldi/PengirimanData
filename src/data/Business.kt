package data

class Business (var namaBisnis: String,
                var temaBisnis: String,
                var tahunBerdiri: Int? = null){
//    var namaBisnis: String
//    var temaBisnis: String
//    var tahunBerdiri: Int? = null

    constructor(namaBisnis: String, temaBisnis: String) : this (namaBisnis, temaBisnis, 2022){

    }
//    constructor(namaBisnisParam: String, temaBisnisParam: String, tahunBerdiriParam: Int)
//            : this(namaBisnisParam, temaBisnisParam, tahunBerdiriParam) {
//
//
//    }
    fun tunjuk() {
    println("Halo, bisnis saya $namaBisnis, umur bisnis saya $tahunBerdiri tahun dan tema bisnis saya $temaBisnis.")
}




//    fun tampil(){
//        if(tahunBerdiri != null){
//            println("saya punya bisnis $namaBisnis dan tema bisnis saya yaitu $temaBisnis berdiri sejak $tahunBerdiri")
//        } else {
//            println("saya punya bisnis $namaBisnis dan tema bisnis saya yaitu $temaBisnis")
//        }
//    }

}
