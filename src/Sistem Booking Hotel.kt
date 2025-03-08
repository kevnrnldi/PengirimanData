class Hotel(val nama: String,val lokasi: String,val hargaPerMalam: Int){
    fun info(){
        println("nama : $nama, lokasi : $lokasi, harga per malam : $hargaPerMalam")
    }
}


data class Pelanggan (val nama: String,val lamaMenginap: Int)


abstract class Pembayaran(val pelanggan: Pelanggan,val hotel: Hotel){
    abstract fun prosesPembayaran()
}

interface DapatDiskon{
    fun hitungDiskon(): Int
}


sealed class Status{
    object Sukses : Status()
    object Gagal : Status()
}



class pembayaranHotel(pelanggan: Pelanggan,hotel: Hotel): Pembayaran(pelanggan, hotel),DapatDiskon{
    override fun hitungDiskon(): Int {
        return if(pelanggan.lamaMenginap >= 7) (hotel.hargaPerMalam * pelanggan.lamaMenginap * 10) / 100 else 0
    }

    override fun prosesPembayaran() {
        val total = (hotel.hargaPerMalam * pelanggan.lamaMenginap) - hitungDiskon()
        println("Pembayaran untuk ${pelanggan.nama} yaitu Rp$total")
    }

}

fun main(){
    var hotel = Hotel("Kenara","Jakarta",1600000)
    var pelanggan = Pelanggan("Kevin", 0)
    var pembayaran = pembayaranHotel(pelanggan,hotel)

    hotel.info()
    pembayaran.prosesPembayaran()


    val status = if (pelanggan.lamaMenginap > 0) Status.Sukses else Status.Gagal
    println("Status Pembayaran: ${if (status is Status.Sukses) "Sukses" else "Gagal"}")

}