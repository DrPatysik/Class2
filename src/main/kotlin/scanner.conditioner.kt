import java.util.*

fun main()
{
    do {
        println("What is the time ?")
        val isDayTime = Scanner(System.`in`).nextInt() in 9..20

        if ( !isDayTime )
        {   println("Conditioner is off")
            println( "Do you want to turn on the conditioner?(y/n)")
        }
        else
        {
            println("What is the temperature now ?")
            val currentTemperature = Scanner(System.`in`).nextInt()
            val ifHot = currentTemperature >= 28
            val ifCold = currentTemperature in 0..19


            if (currentTemperature in 0..50)
            {
                if (ifHot)
                 { println("Conditioner is cooling") }
                 else if ( ifCold )
                 { println(" Conditioner is warming") }
                println("Do you want to change the temperature?(y/n)")
            } else
            { println("Conditioner is off") }
        }
    println()
    }
        while ( true )
}