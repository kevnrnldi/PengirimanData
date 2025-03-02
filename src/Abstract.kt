


abstract class iniAbstrak (var mobil : String)

class mobilku(mobil: String) : iniAbstrak(mobil){
    override fun toString(): String {
        return mobil
    }
}



fun main (){
    var percobaan1 = mobilku("bmw z4")
    println(percobaan1)

    var hewan1 = kucing("milo")
    hewan1.berlari()
    hewan1.bunyi()
    var hewan2 = anjing("max")
    hewan2.berlari()
    hewan2.bunyi()

}



abstract class animal(name: String){
    init {
        println(name)
    }
    abstract var nama: String
    abstract fun berlari() : Unit
    abstract fun bunyi() : Unit
}

class kucing(name: String) : animal(name) {
    override var nama: String = "kucing"
    override fun berlari() {
      println("$nama sedang berlari")
    }
    override fun bunyi() {
      println("Meong")
    }
}

class anjing(name: String) : animal(name) {
    override var nama: String = "anjing"
    override fun berlari() {
      println("$nama sedang berlari")
    }
    override fun bunyi() {
      println("Guk")
    }
}



class tempatTinggal(daerah: String){
    var daerah: String = daerah
        get() {
            println("getter")
            return field

        }
        set(value) {
            if (value.isNotBlank()){
                field = value
                println("setter")
            } else{
                println("invalid")
            }
        }
}