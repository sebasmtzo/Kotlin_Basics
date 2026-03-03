package example.myapp

// Clase base
open class AquariumPlant(val color: String, private val size: Int)

// Subclase
class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

// Funciones de extensión
fun AquariumPlant.isRed() = color == "red"

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

// Propiedad de extensión
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

// Función de extensión para String
fun String.hasSpaces(): Boolean = indexOf(" ") != -1

// Extensiones para probar resolución estática
fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun main() {
    // --- Extension para String ---
    val s1 = "Hello World"
    val s2 = "HelloWorld"
    println("$s1 has spaces? ${s1.hasSpaces()}")  // true
    println("$s2 has spaces? ${s2.hasSpaces()}")  // false

    // --- Extensiones para AquariumPlant ---
    val plant = GreenLeafyPlant(10)
    plant.print()  // GreenLeafyPlant

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  // AquariumPlant (resolución estática)

    println("Is plant green? ${plant.isGreen}")  // true
    println("Is plant red? ${plant.isRed()}")    // false

    val plant2: AquariumPlant? = null
    plant2.pull()  // No imprime nada

    val plant3: AquariumPlant? = plant
    plant3.pull()  // imprime "removing GreenLeafyPlant@..."
}