package app

fun main() {

try {
    println("Masukkan angka pertama: ")
    val nilaiPertama = readLine()?.toDoubleOrNull() ?: throw NumberFormatException()
    println("Masukkan angka kedua: ")
    val nilaiKedua = readLine()?.toDoubleOrNull() ?: throw NumberFormatException()

    println("Pilih Operasi : +, -, *, /")
    val operator = readln().trim()


        when (operator) {
            "+" -> println("Hasil: ${nilaiPertama + nilaiKedua}")
            "-" -> println("Hasil: ${nilaiPertama - nilaiKedua}")
            "*" -> println("Hasil: ${nilaiPertama * nilaiKedua}")
            "/" -> {
                if (nilaiKedua == 0.0) throw ArithmeticException("Tidak bisa dibagi dengan nol!")
                   println("Hasil: ${nilaiPertama / nilaiKedua}")

            }

            else -> throw IllegalArgumentException("Operator tidak valid! pilih +, -, *, /.")
        }

    } catch (e: NumberFormatException){
        println("Error: Harap Masukkan Angka yang valid")
    }
    catch (e: ArithmeticException){
        println("Error: ${e.message}")
    }
    catch (e: IllegalArgumentException){
        println("Error: ${e.message}")
    }
}