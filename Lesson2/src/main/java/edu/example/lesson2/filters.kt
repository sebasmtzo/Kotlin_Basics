package edu.example.lesson2

// Top-level list
val decorations = listOf(
    "rock",
    "pagoda",
    "plastic plant",
    "alligator",
    "flowerpot"
)

fun main() {

    println("=== Step 1: Create a filter ===")
    println(decorations.filter { it[0] == 'p' })


    println("\n=== Step 2: Compare eager and lazy filters ===")

    // eager → creates a new list immediately
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    // lazy → waits until evaluated
    val filtered = decorations.asSequence()
        .filter { it[0] == 'p' }

    println("filtered: $filtered")

    // force evaluation
    val newList = filtered.toList()
    println("new list: $newList")


    println("\n=== Lazy map example ===")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")


    println("\n=== Filter + map (lazy) ===")

    val lazyMap2 = decorations.asSequence()
        .filter { it[0] == 'p' }
        .map {
            println("access: $it")
            it
        }

    println("-----")
    println("filtered: ${lazyMap2.toList()}")


    println("\n=== Flatten example ===")

    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")

    val mylist = listOf(mysports, myplayers, mycities)

    println("-----")
    println("Flat: ${mylist.flatten()}")
}
