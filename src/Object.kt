


object database{
    fun connect (){
        println("berhasil")
    }
    fun disconnect (){
        println("tidak berhasil")
    }
}

fun main(){
    database.connect()
    database.disconnect()
    var panggil = userku.connect()
    println("nama user : ${panggil.nama}")
}


class userku(var nama: String) {
    companion object{
        fun connect (): userku{
            return userku("Kevin")
        }
    }
}

