import java.util.*
fun main(){

    println("What the time ?")
    val scannerTime = Scanner(System.`in`).nextInt()
    println("What the weather (good/bad) ?")
    val scannerWeather = Scanner(System.`in`).next().toLowerCase()


    if ((scannerTime in 21..24 || scannerTime in 1..6 ) && (scannerWeather=="good" || scannerWeather=="bad" ))
    {
        println("Go to bed !")
    }
    else if ( scannerTime in 7..20 && scannerWeather == "good")
    {
        println(" Go to walk !")
    }
    else
    {
        println("To read book !")
    }
}








