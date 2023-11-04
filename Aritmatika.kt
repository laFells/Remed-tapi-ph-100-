package remed

fun main() {
    //Buat rumus untuk menghitung aritmatka menggunakan range
    val a = 7..262 step 5
    var jumlahsemuasuku = 0
    a.forEachIndexed { index, angka ->
        println("suku ${index + 1} adalah $angka")
    }

}