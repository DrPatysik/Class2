import java.util.*

fun main() {
    println("What is the temperature now ?")
    val currentTemperature = Scanner(System.`in`).nextInt()
    println("What is the time ?")
    val currentTime = Scanner(System.`in`).nextInt()

    val isDayTime = currentTime in 9..20
    val ifHot = currentTemperature >=28
    val ifCold = currentTemperature <= 0


    if (ifHot && isDayTime) {
        println("Conditioner is cooling")
    } else if (ifCold || !isDayTime)
    { println("Conditioner is off")
    }
    else {
        println(" Conditioner is warming") }

}