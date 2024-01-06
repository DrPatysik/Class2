import java.util.*

fun main(args: Array<String>) {


    do {
        println("Сколько секунд ?")
        val seconds = Scanner(System.`in`).nextLong()

        calcDayHour()
        val leftSeconds = seconds - howMDays(seconds)* calcDayHour().toList()[0] - howMHours(seconds) *
                calcDayHour().toList()[1] - howMMins(seconds) * 60


            println("Общее количество дней: ${howMDays(seconds)} !")
        println("Общее количество часов: ${howMHours(seconds)} !")
        println("Общее количество минут: ${howMMins(seconds)} !")
        println("Оставшееся количество секунд: ${leftSeconds} !")

        println(" Хотите продолжить?(да/нет)")
        val yes = Scanner(System.`in`).next().toLowerCase() == "да"
    } while ( yes )
    println(" До свидания!")
}

fun calcDayHour(): Pair< Int,Int> = (24 * 60 * 60) to (60 * 60)

    fun howMDays(scanS:Long):Long
    { val days = scanS / calcDayHour().toList()[0]
        return days
    }

    fun howMHours(scanS: Long):Long
    { val hours = (scanS % calcDayHour().toList()[0]) / calcDayHour().toList()[1]
        return hours
    }

    fun howMMins(scanS: Long):Long
    { val minutes = ((scanS % calcDayHour().toList()[0]) % calcDayHour().toList()[1]) / 60
        return minutes
    }