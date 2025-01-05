fun main(){
    var nama: Array<String> = arrayOf("porsche","mclaren","mercedes benz")
    val tipe: Array<Int> = arrayOf(911,675,63)
    val mobil1 = nama[0]
    val mobil2 = nama[1]
    val mobil3 = nama.get(2)

    val gaming: Array<String?> = arrayOfNulls(2)
    gaming[0] = "Kevin"
    println(gaming[1])


    for(forLoopKotlin in nama){
        println(forLoopKotlin)
    }

   

    tipe.set(1,720)
    println(tipe[1])
    println(mobil2)
    println(mobil3)

    var range = 0..15
    var range1 = 0..40 step 5
    println(range1.contains(23))


    var nilaiku = 100
    var kehadiran = 90
     var tugas = 75

    when{
        nilaiku > 80 -> println("nice")
        nilaiku > 70 -> println("Not Bad")
        else  -> println("Bad")
    }

if(nilaiku >= 75 && tugas >= 80) {
    if (kehadiran >= 70) {
        println("Lulus")
    }
}else {
    println("Tidak Lulus")
    }

    val finalexam = "D"
    //when(finalexam){
      //  "A","B","C" -> println("Pass")
        //else -> println("try again")
    //}

// in untuk mengecek pada array ada elemennya atau tidak
    val passValues = arrayOf("A","B","C")
    when(finalexam){
        in passValues -> println("Lulus")
        !in passValues -> println("Tidak Lulus")
    }

    var ceknilai = "saya"
        when(ceknilai){
            is String -> println("Benar ini String")
            !is String -> println("Ini Bukan String")
    }




}
