import java.util.*
fun main(){

while (true)
{
    println("How much money do you have ?")
    val howMuchMoney = Scanner(System.`in`).nextInt()
    val ifRich = howMuchMoney > 500
    val ifNotRich = howMuchMoney in 300..500
    val ifMedium = howMuchMoney in 100..299
    val ifPoor = howMuchMoney in 0..99


    if (ifRich)
    { println("You can buy a pizza !")
    } else if (ifNotRich)
    { println("You can buy a pasta ! ")
    } else if (ifMedium)
    { println("You can buy a hamburger !")
    } else if (ifPoor)
    { println("You can buy pamen !")
    } else
    { println("Go to foodbank !")
        break
    }
    println()
    println()
}
println("See you later!")
}




