import java.util.*


fun main()
{
    do {
        val currentTime = getTime()
        var currentTemperature = 0
        when (currentTime)
        {
            in 9..20 -> {
                currentTemperature = getTemperature()
                chooseRegime(currentTemperature)
            }
            else -> {
                println("Conditioner is off!  Do you want to turn on the conditioner?(yes/no)")
                val userAnswer = Scanner(System.`in`).next().toLowerCase()
                if (userAnswer != "yes") {
                    break
                }
                currentTemperature = getTemperature()
                chooseRegime(currentTemperature)
            }
        }
    } while (currentTemperature >= 0)
    println("See you later!")

}
 fun chooseRegime(usingTemp:Int )
 {  when (usingTemp)
    {   in 28..50 -> println("Conditioner is cooling")
        in 0..19 -> println(" Conditioner is warming")
        else -> println("Conditioner is off")
    }
 }

 fun getTime():Int
    { println("What is the time ?")
        val time = Scanner(System.`in`).nextInt()
        return time
    }

fun getTemperature():Int
    { println("What is the temperature now?")
        val curTemperature = Scanner(System.`in`).nextInt()
        return  curTemperature
    }