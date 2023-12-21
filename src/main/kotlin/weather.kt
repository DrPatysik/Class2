import java.util.*

fun main() {

    println("What the time ?")
    val scannerTime = Scanner(System.`in`).nextInt()
    println("What the weather (good/bad) ?")
    val scannerWeather = Scanner(System.`in`).next().toLowerCase()
    val ifNight = scannerTime in 21..24 || scannerTime in 1..6
    val ifDay = scannerTime in 7..20
    val ifGoodWeather = scannerWeather == "good"

//FIXME убрать лишнюю переменную
    if (ifNight ) {
        println("Go to bed !")
    } else if (ifDay && ifGoodWeather) {
        println(" Go to walk !")
    } else {
        println("To read a book !")
    }
}








