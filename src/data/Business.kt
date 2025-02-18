package data

class Business {
    var namaBisnis: String
    var temaBisnis: String
    var tahunBerdiri: Int? = null

    constructor(paramNama: String, paramTema: String){
         namaBisnis = paramNama
         temaBisnis = paramTema

    }
    constructor(paramNama: String,paramTema: String,paramTahun: Int) : this(paramNama,paramTema){
         tahunBerdiri = paramTahun

    }


    fun tampil(){
        if(tahunBerdiri != null){
            println("saya punya bisnis $namaBisnis dan tema bisnis saya yaitu $temaBisnis berdiri sejak $tahunBerdiri")
        } else {
            println("saya punya bisnis $namaBisnis dan tema bisnis saya yaitu $temaBisnis")
        }
    }

}
