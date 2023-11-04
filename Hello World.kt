package remed

fun main() {
    //print
    //  "Saya lapar sekali, minjem 100 dong buat makan hari ini" 600 kali
    // GUNAKAN RANGE
    val minjemduit = 1..600
    minjemduit.forEachIndexed { index, minjemduit ->
        println("${index +1}. saya lapar sekali, minjem duit 100 dong buat makan hari ini")
    }
}