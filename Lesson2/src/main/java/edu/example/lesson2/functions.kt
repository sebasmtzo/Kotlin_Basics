package edu.example.lesson2
import java.util.*    // required import


//////////////////////// Step 1 ////////////////////////
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}

//////////////////////// Step 2 ////////////////////////
fun fishFood (day : String) : String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}

// Declarando valores no definidos
fun fishFood2 (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish2() {
    val day = randomDay()
    val food = fishFood(day)
    val food2 = fishFood2(day)

    println ("1: Today is $day and the fish eat $food")
    println ("2: Today is $day and the fish eat $food2")
}


fun main(args: Array<String>)
{
    println("=== Step 1: Create some functions ===")
    feedTheFish()


    println("\n=== Step 2: Use a when expression ===")
    feedTheFish2()
}