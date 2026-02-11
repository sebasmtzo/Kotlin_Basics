package edu.example.lesson1

fun main() {

    println("=== Step 1: Make lists ===")

    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    // remove
    val myList = mutableListOf("tuna", "salmon", "shark")
    println(myList)
    myList.remove("shark")
    println(myList)



    println("\n=== Step 2: Create arrays ===")

    val school1 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school1))

    val mix = arrayOf("fish", 2)
    println(java.util.Arrays.toString(mix))

    val numbers = intArrayOf(1,2,3)
    println(java.util.Arrays.toString(numbers))

    val numbers1 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers1
    println(foo2[5])


    val numbers2 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers2, oceans, "salmon")
    println(oddList)

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))


    println("\n=== Step 3: Create loops ===")

    val school3 = arrayOf("shark", "salmon", "minnow")
    for (element in school3) {
        print(element + " ")
    }


    for ((index, element) in school3.withIndex()) {
        println("\nItem at $index is $element")
    }


    for (i in 1..5) print(i)
    println("")
    for (i in 5 downTo 1) print(i)
    println("")
    for (i in 3..6 step 2) print(i)
    println("")
    for (i in 'd'..'g') print (i)



    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("\n$bubbles bubbles in the water\n")

    var bubbles1 = 70
    do {
        bubbles1--
    } while (bubbles1 > 50)
    println("\n$bubbles1 bubbles in the water\n")

    repeat(2) {
        println("\nA fish is swimming")
    }
}