import java.util.*

fun main() {

    println("What the time ?")
    val scannerTime = Scanner(System.`in`).nextInt()
    println("What the weather (good/bad) ?")
    val scannerWeather = Scanner(System.`in`).next().toLowerCase()
    val night = scannerTime in 21..24 || scannerTime in 1..6
    val anyWeather = scannerWeather == "good" || scannerWeather == "bad"
    val day = scannerTime in 7..20
    val goodWeather = scannerWeather == "good"

//FIXME убрать лишнюю переменную
    if (night && anyWeather) {
        println("Go to bed !")
    } else if (day && goodWeather) {
        println(" Go to walk !")
    } else {
        println("To read a book !")
    }
}








