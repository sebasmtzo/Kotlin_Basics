package example.myapp

fun main() {
    println("=== Colecciones: Listas y Mapas ===\n")

    // Paso 1: Listas
    val numbers = listOf(1, 5, 3, 4)
    println("Suma de numbers: ${numbers.sum()}") // 13

    val words = listOf("a", "bbb", "cc")
    println("Suma de longitudes de palabras: ${words.sumBy { it.length }}") // 6

    // Recorrer usando listIterator
    print("Palabras: ")
    for (w in words.listIterator()) {
        print("$w ")
    }
    println("\n")

    // Paso 2: Mapas Hash
    val scientific = hashMapOf(
        "guppy" to "poecilia reticulata",
        "catfish" to "corydoras",
        "zebra fish" to "danio rerio"
    )

    println("Nombre cientifico del guppy: ${scientific["guppy"]}") // poecilia reticulata
    println("Nombre cientifico del zebra fish: ${scientific["zebra fish"]}") // danio rerio

    // Intentar buscar un pez que no está
    println("Nombre cientifico del swordtail: ${scientific["swordtail"]}") // null

    // Usando getOrDefault
    println("Usando getOrDefault: ${scientific.getOrDefault("swordtail", "sorry, I don't know")}")

    // Usando getOrElse con lambda
    println("Usando getOrElse: ${scientific.getOrElse("swordtail") { "sorry, I don't know" }}")

    // MutableMap ejemplo
    val mutableScientific = mutableMapOf(
        "angelfish" to "pterophyllum",
        "tetras" to "paracheirodon"
    )

    println("\nMapa mutable inicial: $mutableScientific")
    mutableScientific["goldfish"] = "carassius auratus" // agregar
    println("Despues de agregar goldfish: $mutableScientific")
    mutableScientific.remove("tetras") // eliminar
    println("Despues de eliminar tetras: $mutableScientific")
}