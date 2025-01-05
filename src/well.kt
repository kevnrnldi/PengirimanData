fun main (){
 val name: String = "kevin"
    println(name.hello())
    name.printHello()
    "Porsche".printHello()
}

fun String.printHello (): Unit = println("hello a $this")


fun String.hello(): String{
    return "hai $this"
}
