import java.util.*
fun main()
{
    do {
        val quantoMoney = getMoney()
        chooseFood(quantoMoney)

        println("Do you want to continue?(yes/no)")
        val wantContinue = Scanner(System.`in`).next().toLowerCase()
        println()
    }
    while( quantoMoney in 1 .. 1000_000 && wantContinue =="yes")
        println("See you later!Bye-bye!")
}


fun getMoney():Int
{  println("How much money do you have ?")
    val howMuchMoney = Scanner(System.`in`).nextInt()
    return howMuchMoney
}

fun chooseFood(money:Int)
{   when(money)
    { in 1..99 -> println("You can buy ramen !")
    in 100..299 -> println("You can buy a hamburger !")
    in 300..500 -> println("You can buy a pasta ! ")
    in 500..1_000_000 -> println("You can buy a pizza !")
    else -> println( "Sorry,dude,this is not your day!")
    }
}