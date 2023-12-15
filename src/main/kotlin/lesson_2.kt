import java.util.*

// как работает Char
/*fun main() {
    val a = '@'
    val b = 89.toChar()
    println(a)
    println(b + 5)
}*/

// Scanner
/*
fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter your name: ")
    val name = scanner.next()
    println("Hello, $name !")
}*/

//conditioner
fun main() {
    val currentTemp = 30
    if (currentTemp >= 28) { println("Conditioner is cooling") }
    else if (currentTemp <= 13) { println("Conditioner is warming") }
    else { println("Conditioner is off") }

}