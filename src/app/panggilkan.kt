package app

import com.company.belajar.util.sayhello
import data.Mobil
import tempatTinggal


fun main(){
    var coba1 = tempatTinggal("Singapura")
    println(coba1.daerah)

    coba1.daerah = ""
    println(coba1.daerah)


    var coba2 = fastfood()
    coba2.burger = "Mcdonald"
    coba2.fast("Burger King")
    println(coba2.burger)


//    var person = memanggilInterface("kevin")
//    person.sayHello("apad")
    var person2 = memanggilInterface("joko","ferrari")
    person2.kendaraan("celyn","ferrari")

    var human = multipleInterface("entah")
    human.belok()

}


class fastfood{
    lateinit var burger: String

    fun fast(burger : String){
     this.burger = burger

    }
}


interface Interaction {
    var nama: String
    fun sayHello(nama: String)  {
        println(" nama saya ${this.nama} dan nama teman saya $nama")
    }

}

interface Berjalan : Interaction {
    var mobil: String
    fun jalan(nama: String){
       println("${this.nama} : mantap jiwa $nama")
    }
    fun kendaraan(nama: String, mobil: String){
       println("${this.nama} mobilmu $mobil lebih kencang dari punya $nama")
    }
}

interface belokKanan {
    var belok: String
    fun belok(){
        println("belok kanan")
    }
}

interface belokKiri  {
    var belok: String
    fun belok(){
        println("belok kiri")
    }
}

class multipleInterface(override var belok: String) : belokKiri, belokKanan {
    override fun belok() {
        if (belok == "kiri") {
            super<belokKiri>.belok()
        } else if(belok == "kanan") {
            super<belokKanan>.belok()
        } else {
            println("input salah")
        }
    }


}

class memanggilInterface(override var nama: String, override var mobil: String) :  Berjalan {
//    override fun sayHello(nama: String) {
//        println(" nama saya ${this.nama} dan nama teman saya $nama")
//    }

}

