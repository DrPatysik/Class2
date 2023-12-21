import java.util.*
fun main()
{
    do {
        println("How much money do you have ?")
        val howMuchMoney = Scanner(System.`in`).nextInt()
        val ifRich = howMuchMoney in 500..1000_000
        val ifNotRich = howMuchMoney in 300..500
        val ifMedium = howMuchMoney in 100..299
        val ifPoor = howMuchMoney in 1..99

        if (ifRich)
            { println("You can buy a pizza !") }
        else if (ifNotRich)
             { println("You can buy a pasta ! ") }
        else if (ifMedium)
            { println("You can buy a hamburger !") }
        else if (ifPoor)
            { println("You can buy ramen !") }
        else
            { println( "Sorry,dude,this is not your day!") }
        println()

        println("Do you want to continue?(y/n)")
        val positive = Scanner(System.`in`).next().toLowerCase()  == "yes"
        println()

    }
    while( howMuchMoney in 1 .. 1000_000 && positive)
        println("See you later!")
}

