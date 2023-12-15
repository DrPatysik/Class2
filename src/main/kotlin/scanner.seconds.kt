import java.util.*

fun main() {
        println("Сколько секунд ?")
        val scanner = Scanner(System.`in` ).nextInt()
        val oneDayInSeconds = 24 * 60 * 60
        val days = scanner / oneDayInSeconds
        val oneHourInSeconds = 60 * 60
        val hours = ( scanner % oneDayInSeconds ) / oneHourInSeconds
        val minutes = (( scanner % oneDayInSeconds ) % oneHourInSeconds ) / 60
        val leftSeconds = scanner - days * oneDayInSeconds - hours * oneHourInSeconds - minutes * 60
//    вывод в консоль
        println("Общее количество дней: $days !")
        println("Общее количество часов: $hours !")
        println("Общее количество минут: $minutes !")
        println("Оставшееся количество секунд: $leftSeconds !")
}

