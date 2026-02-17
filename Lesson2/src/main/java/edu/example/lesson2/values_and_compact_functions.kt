package edu.example.lesson2

//////////////////////// Step 1 ////////////////////////
// Funcion con valor default
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

//////////////////////// Step 3 ////////////////////////
// Compact functions (single-expression functions)
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

//////////////////////// Step 2 ////////////////////////
fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun feedTheFish3() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun main() {

    println("=== Step 1: Create a default value for a parameter ===")

    swim()                      // default
    swim("slow")                // positional
    swim(speed = "turtle-like") // named

    println("\n=== Step 2 & 3 ===")

    feedTheFish3()
}
