fun main() {

    fun String.panggil(){
        println("hallo $this")
    }
    "kevin".panggil()


    val test = lambdaCoba()
    test.jalankan()
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

