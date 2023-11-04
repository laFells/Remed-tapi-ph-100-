package remed

fun main() {
    //Buat contoh array min. 20 lalu print
    val makanan: Array<String> = arrayOf(
        "tahu goreng",
        "tempe Goreng",
        "nasi goreng",
        "Sosis bakar",
        "Roti bakar",
        "Pisang bakar",
        "Semur jengkol",
        "Opor ayam",
        "Nasi Uduk",
        "Nasi kuning",
        "Mie goreng",
        "Puding lele",
        "Puding lele",
        "Dimsum",
        "Ikan bakar",
        "telor balado",
        "Siomay sapu sapu",
        "Gado gado",
        "Ketoprak",
        "Bubur ayam",
        "rendang",
        "Soto ayam",
        "Bakso",
        "Ayam goreng",
        "Sotong bakar",
    )
    makanan.forEachIndexed { index, makanan ->
        println(makanan)
    }
}