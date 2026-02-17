package edu.example.lesson2


fun main() {
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    // Impresion de texto de acuerdo a la condicion
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
}