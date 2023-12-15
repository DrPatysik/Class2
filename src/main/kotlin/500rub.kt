import java.util.*
fun main(){

while (true)
{
    println("How much money do you have ?")
    val howMuchMoney = Scanner(System.`in`).nextInt()
    val rich = howMuchMoney > 500
    val notRich = howMuchMoney in 300..500
    val medium = howMuchMoney in 100..299
    val poor = howMuchMoney in 0..99


    if (rich)
    { println("You can buy a pizza !")
    } else if (notRich)
    { println("You can buy a pasta ! ")
    } else if (medium)
    { println("You can buy a hamburger !")
    } else if (poor)
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




