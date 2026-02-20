package edu.example.lesson2

////////////////////// Step 1: Lambdas //////////////////////

var dirtyLevel = 20

// Lambda simple
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }


////////////////////// Step 2: Higher-order function //////////////////////

// Función de orden superior
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

// Función normal (no lambda)
fun increaseDirty(start: Int) = start + 1


fun main() {
    println("=== Step 1: Lambda ===")
    println(waterFilter(dirtyLevel))


    println("\n=== Step 2: Higher-order function ===")

    // Pasando lambda como variable
    println(updateDirty(30, waterFilter))

    // Pasando función normal con ::
    println(updateDirty(15, ::increaseDirty))


    println("\n=== Last parameter call syntax ===")

    var dirtyLevel = 19

    dirtyLevel = updateDirty(dirtyLevel) { level ->
        level + 23
    }

    println(dirtyLevel)
}