fun main() {

    val daftarTugas = mutableListOf<String>()

    while (true) {
        println("Todo-List")
        println("1. Tambah Tugas")
        println("2. Lihat Tugas")
        println("3. Hapus Tugas")
        println("4. Keluar")
        println("Pilih Menu")

        val pilihan = readlnOrNull()?.toIntOrNull()

        when (pilihan) {
            1 -> menambah(daftarTugas)
            2 -> menampilkan(daftarTugas)
            3 -> menghapus(daftarTugas)
            4 -> {
                println("Keluar dari aplikasi")
                break
            }

            else -> println("Pilihan tidak terdapat dalam menu")

        }
    }

}


fun menambah(daftarTugas :  MutableList<String>) {
    println("masukkan kodenya")
    val tugas = readlnOrNull()?.trim()
    if(!tugas.isNullOrEmpty()){
        daftarTugas.add(tugas)
        println("tugas berhasil ditambahkan")
    } else {
        println("tugas tidak boleh kosong")
    }
}

fun menampilkan(daftarTugas: MutableList<String>) {
    if (daftarTugas.isEmpty()) {
        println("Belum ada tugas.")
    } else {
        println("Daftar Tugas:")
        daftarTugas.forEachIndexed { index, tugas ->
            println("${index + 1}. $tugas")
        }
    }
}
fun menghapus(daftarTugas : MutableList<String>) {
    println("masukkan nomor tugas yang ingin dihapus")
    val nomor = readlnOrNull()?.toIntOrNull()
    if(nomor != null &&  nomor in 1..daftarTugas.size){
        daftarTugas.removeAt(nomor - 1 )
        println("tugas berhasil dihapus")
    }else{
        println("nomor tugas tidak ditemukan")
    }
}