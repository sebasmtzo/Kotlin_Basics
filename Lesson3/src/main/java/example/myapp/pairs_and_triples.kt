package example.myapp

fun main() {
    println("=== Pairs y Triples ===")

    // --- Crear un Pair ---
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    // --- Crear un Triple ---
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())  // (6, 9, 42)
    println(numbers.toList())    // [6, 9, 42]

    // --- Pair dentro de un Pair ---
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}")  // accede al segundo elemento del Pair interno

    // --- Desestructuración de un Pair ---
    val (tool, use) = equipment
    println("$tool is used for $use")

    // --- Desestructuración de un Triple ---
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")
}