import java.util.*

fun main() {
    println("Какое кол-во дней ?")
    val days = Scanner(System.`in`).nextInt()

    val daysInYear = 365
    val years = days / daysInYear
    //println(years) вывод в консоль
    val months = (days % daysInYear) / 31
    val leftDays = days - years * daysInYear - months * 31

    println("Общее кол-во лет: $years!")
    println("Общее кол-во месяцев: $months!")
    println("Оставшееся кол-во дней: $leftDays!")

}