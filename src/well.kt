fun main (){

//     tailrec fun display (value: Int) {
//        println("Recursive $value")
//        if(value > 0){
//            display(value - 1)
//        }
//    }





 val name: String = "kevin"
    println(name.hello())
    name.printHello()
    "Porsche".printHello()
    val result = "kevin" to "GG"
    println(result)


    tailrec fun recursiveMencoba (name: Int, total: Int = 1):Int{
       return when(name){
            1 -> total
            else ->  recursiveMencoba(name - 1, name * total )
        }
    }
println(recursiveMencoba(5))


    fun factorialLoop(value: Int): Int{
        var result = 1
        for(i in value downTo 1){
            result *= i
        }
        return result
    }
    println(recursiveMencoba(10))
    println(factorialLoop(10))
}

fun String.printHello (): Unit = println("hello a $this")


fun String.hello(): String{
    return "hai $this"
}


infix  fun String.to(type: String): String{
//     return if(type == "GG"){
//         this.toUpperCase()
//    } else {
//         this.toLowerCase()
//    }
    return when(type){
        "GG" ->  this.uppercase()
        else ->  this.lowercase()
    }
}



