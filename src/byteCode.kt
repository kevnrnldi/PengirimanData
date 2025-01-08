fun main(){
//   for(i in 1..100){
//       println(cool({"kevin"},{"Rinaldi"}))
//   }

// digunakan untuk label break
//  loopI@  for( i in 1..10){
//      loopJ@ for(j in 1..10){
//          if(i > 5){
//              break@loopI
//
//          }
//            println("$i X $j = ${i * j} ")
//
//        }
//    }

////label continue
//    loopI@ for (i in 1..8){
//        loopJ@ for(j in 1..8){
//            if(j == 5){
//                continue@loopI
//            }
//            println("$i * $j = ${i * j}")
//        }
//    }

    //label return
    test("kevin") test@{
        if (it == ""){
            return@test
        }else{
            println("porsche & ducati")
        }
    }


}

 inline fun cool(name: ()-> String, lastName: () -> String):String{
    return "hello ${name()} ${lastName()}"
}

fun test(name: String, param: (String)-> Unit): Unit = param(name)