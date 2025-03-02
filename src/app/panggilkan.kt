package app

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

}


class fastfood{
    lateinit var burger: String

    fun fast(burger : String){
     this.burger = burger

    }
}


