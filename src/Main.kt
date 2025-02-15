fun main() {

   var firstName: String = "Kevin"
   var LastName: String = "VIN"
    println(firstName + " " + LastName)




    var text: String = """
        Nama saya kevin
        saya tinggal di singapura
        mobil saya porsche
    """



    println("saya ingin porsche dan ${text}")
    println("total char ${firstName + " " + LastName} = ${firstName.length + LastName.length}")

//immutable/konsisten variable val dan const
    //const khusus untuk global atau digunakna dalam OOP
        //mutable variable var
    //nullable
    val nilai1 = 12
    var nilai2 = 13
    var nilai3: String? = null
    println("${nilai3} ${nilai2 + nilai1}")


    var arrayKita: Array<String> = arrayOf("porsche","mclaren","Mercedes Benz")
    println(arrayKita[1])
}

//hanya bisa digunakan diluar local function/class
const val APP = "application"
val kevin = "nama"