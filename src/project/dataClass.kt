package project

data class user(var username: String,var umur: Int)



fun main(){
    var orangpertama = user("kevin",20)
    var orangkedua = user("porsche",22)
    println(orangpertama.equals(orangkedua))
    var orangketiga = orangkedua.copy(umur = 19)
    println(orangketiga)




    var orang1 = cekLogin("kevin",123)
    when(orang1){
        is hasilLogin.sukses -> println("login berhasil, selamat datang ${orang1.user.username}")
        is hasilLogin.gagal -> println("login gagal : ${orang1.error}")
       hasilLogin.loading -> println("sedang loading...")
    }

}



sealed class hasilLogin{
    data class sukses(val user: user): hasilLogin()
    data class gagal(val error: String): hasilLogin()
    object loading : hasilLogin()
}


fun cekLogin( username: String,  password: Int) : hasilLogin{
    return when{
        username == "kevin" && password == 123 -> hasilLogin.sukses(user(username,22))
        username == "kevin" -> hasilLogin.gagal("Password Salah")
        else -> hasilLogin.gagal("User tidak ditemukan")
    }
}


