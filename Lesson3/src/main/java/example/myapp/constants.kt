package example.myapp

fun complexFunctionCall(): Int {
    return (1..10).random()
}

// Constante determinada en tiempo de compilación
const val ROCKS = 3

// Val normal, puede asignarse en tiempo de ejecución
val value1 = complexFunctionCall()  // ejemplo: función que devuelve un valor

class MyClass {
    companion object {
        const val COMPANION_CONSTANT = "constant in companion"
    }
}

object Constants {
    const val OBJECT_CONSTANT = "constant in object"
}

fun main() {
    println("Constante del object: ${Constants.OBJECT_CONSTANT}")

    println("Constante del companion object: ${MyClass.COMPANION_CONSTANT}")
}