package edu.example.lesson2

fun printHello() {
    println ("Hello World")
}


fun main(args: Array<String>) {
    printHello()
    println("Hello, world!")

    // Con argumentos
    println("Hello, ${args[0]}")
}