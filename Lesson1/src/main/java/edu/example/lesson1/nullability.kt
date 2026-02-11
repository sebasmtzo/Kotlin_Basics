package edu.example.lesson1

fun main() {

    println("=== STEP 1: Learn about nullability ===")

    //Error: "null can not be a value of a non-null type Int"
    //var rocks: Int = null

    var marbles: Int? = null

    println("\n=== STEP 2: Learn about the ? and ?: operators ===")

    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
        println("fishFoodTreats")
    }

    // Error, asegurar un valor en caso de null
    // fishFoodTreats = fishFoodTreats?.dec()

    fishFoodTreats = fishFoodTreats?.dec() ?: 0

    // val len = s!!.length   // throws NullPointerException if s is null
}