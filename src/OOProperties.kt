
fun main() {
    val fullName = Person("muhammad","kevin","rinaldi")
    fullName.nama()
    val objectName = orang()
    objectName.firstName


    val objectCar = orang()
    objectCar.middleName = "  porsche"

    val objectMoney = orang()
    objectMoney.lastName ="  rich"

    println(objectName.firstName)
    println(objectMoney.lastName)
    println(objectCar.middleName)
}

class orang()
{

    val firstName: String = "apala"
    var middleName: String? = null
    var lastName: String = ""



}







class Person(
    var firstName: String = "",
    var middleName: String? = null,
    val lastName: String = ""
) {
    fun nama (){
       println("nama lengkap saya $firstName $middleName $lastName")
    }

}