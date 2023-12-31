import java.util.*

fun main(args: Array<String>) {


    do {
        println("Сколько секунд ?")
        val seconds = Scanner(System.`in`).nextLong()

        calcDH()

        println("Общее количество дней: ${howDays(scanS = seconds)} !")
        println("Общее количество часов: ${howHours(scanS = seconds)} !")
        println("Общее количество минут: ${howMins(scanS = seconds)} !")
        println("Оставшееся количество секунд: ${leftSec(scanS = seconds)} !")

        val agree:Boolean = question()
    } while ( agree )
    println(" До свидания!")
}

fun calcDH(): Pair< Int,Int> = (24 * 60 * 60) to (60 * 60)

    fun howDays(scanS:Long):Long
    { val days = scanS / calcDH().toList()[0]
        return days
    }

    fun howHours(scanS: Long):Long
    { val hours = (scanS % calcDH().toList()[0]) / calcDH().toList()[1]
        return hours
    }

    fun howMins(scanS: Long):Long
    { val minutes = ((scanS % calcDH().toList()[0]) % calcDH().toList()[1]) / 60
        return minutes
    }

    fun leftSec(scanS: Long):Long
    {val leftSeconds = scanS - howDays(scanS)* calcDH().toList()[0] - howHours(scanS) * calcDH().toList()[1] - howMins(scanS) * 60
        return leftSeconds
    }

    fun question():Boolean
    {  println(" Хотите продолжить?(да/нет)")
        val yes = Scanner(System.`in`).next().toLowerCase() == "да"
        return yes
    }





