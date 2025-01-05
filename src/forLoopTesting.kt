
fun helloWorld(saya: String, mobil: String, umur: Int, kota: String? = null
, kekayaan: Int? ){
    var halo = "halo"
    println("$halo nama saya $saya saya memiliki mobil $mobil diumur $umur")
}

fun main(){
    val nilai = arrayOf(89,76,88,56,90,76,56,90)
    val mobilKu = arrayOf("porsche","mclaren","mercedes benz","ferrari")



   helloWorld("Kevin","Porsche",22,null, null)

    /*   var i = 0
       while(true){
           println( "hello ke $i")
           i++
           if(i>100){
               break
           }
       }



       for (i in 1..100){
           if(i % 2 == 0){
               continue
           }
           println("angka $i")
       }
       */
    /*
    do{
    println("indeks ke $i")
        i--
    }while (i > -10)
*/


    /*

    while (i < 10){
        println("index ke ${i}")
        i++
    }
*/

 /*   var cekMobilku = mobilKu.size - 1
    for (i in 0.. cekMobilku){
        println("index ke ${i} = ${mobilKu.get(i)}")
    }
*/
    //for loop
 /*   var jumlahPerulangan = 0
    for(name in nilai){
     when{
         name >= 90 -> println("Nice Job")
         name >= 80 -> println("Good")
         name >= 70 -> println("Not Bad")
         else -> println("Try Again Next Year")

     }
        jumlahPerulangan++
    }
    println("Total jumlah perulangan = ${jumlahPerulangan}")
}*/

//range
/*
    for(nilais in 0..100 step 6){
    println(nilais)
    }
    */

}
