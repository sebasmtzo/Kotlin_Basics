package edu.example.a1er_examen

fun showSelection()
{
    println("*** Welcome to shelly's Candy shop ***")
    println("To select an item, enter")
    println("1 for Candy")
    println("2 for Chips")
    println("3 for Gum")
    println("4 for Cookies")
    println("9 to exit")
}

fun sellProduct(product: Dispenser, cRegister: CashRegister)
{
    var price: Int
    var coinsInserted: Int
    var coinsRequired: Int

    if (product.getCount() > 0)
    {
        price = product.getProductCost()
        coinsRequired = price
        coinsInserted = 0

        while (coinsRequired > 0)
        {
            println("Please deposit $coinsRequired cents: ")
            coinsInserted = coinsInserted + readLine()!!.toInt()
            coinsRequired = price - coinsInserted
        }

        println(" ")

        cRegister.acceptAmount(coinsInserted)
        product.makeSale()

        println("Collect your item at the bottom and enjoy \n")
    }
    else
    {
        println("Sorry this item is sold out \n")
    }
}


fun main()
{
    val cashRegister = CashRegister()
    val candy = Dispenser(100, 50)
    val chips = Dispenser(100, 65)
    val gum = Dispenser(75, 45)
    val cookies = Dispenser(100, 85)

    var choice: Int

    showSelection()
    choice = readLine()!!.toInt()

    while (choice != 9)
    {
        when (choice)
        {
            1 -> sellProduct(candy, cashRegister)
            2 -> sellProduct(chips, cashRegister)
            3 -> sellProduct(gum, cashRegister)
            4 -> sellProduct(cookies, cashRegister)
            else -> println("Invalid Selection")
        }
        showSelection()
        choice = readLine()!!.toInt()
    }
}