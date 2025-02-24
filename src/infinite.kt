fun main() {

    fun String.panggil(){
        println("hallo $this")
    }
    "kevin".panggil()


    val test = lambdaCoba()
    test.jalankan()


    var nama = anyTesting("kevin")
    var umur = anyKedua(20)
    println(nama.toString())
    println(umur.toString())
}

class anyTesting(var nama: String){
    override fun toString(): String {
        return "my name $nama"
    }
}
class anyKedua(var umur: Int){
    override fun toString(): String {
        return "i'm $umur years old"
    }
}

class lambdaCoba{

    fun tampil(){
        println("halaman ini ditampilkan")
    }

    fun jalankan (){
        var lambda = {
            this.tampil()
        }

        lambda()

    }

}

