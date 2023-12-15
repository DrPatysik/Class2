import java.util.*
fun main(){

while (true) {
    println("How much money do you have ?")
    val howMuchMoney = Scanner(System.`in`).nextInt()

    if (howMuchMoney > 500) {
        println("You can buy a pizza !")
    } else if (300 <= howMuchMoney && howMuchMoney <= 500) {
        println("You can buy a pasta ! ")
    } else if (100 <= howMuchMoney && howMuchMoney < 300) {
        println("You can buy a hamburger !")
    } else if (howMuchMoney < 100 && howMuchMoney > 0) {
        println("You can buy pamen !")
    } else {
        println("Go to foodbank !")
        break
    }

    println()
    println()
}
println("See you later!")
}




