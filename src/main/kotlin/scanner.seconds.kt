import java.util.*

fun main()
{
        do
        {
                println("Сколько секунд ?")
                val howMuchSeconds = Scanner(System.`in`).nextLong()
                val oneDayInSeconds = 24 * 60 * 60
                val days = howMuchSeconds / oneDayInSeconds
                val oneHourInSeconds = 60 * 60
                val hours = (howMuchSeconds % oneDayInSeconds) / oneHourInSeconds
                val minutes = ((howMuchSeconds % oneDayInSeconds) % oneHourInSeconds) / 60
                val leftSeconds = howMuchSeconds - days * oneDayInSeconds - hours * oneHourInSeconds - minutes * 60

                println("Общее количество дней: $days !")
                println("Общее количество часов: $hours !")
                println("Общее количество минут: $minutes !")
                println("Оставшееся количество секунд: $leftSeconds !")
                println()
                println(" Хотите продолжить?(да/нет)")
                val agree = Scanner(System.`in`).next().toLowerCase() == "да"
                println()

        }
        while ( agree )
        println()
        println(" До свидания!")

}

