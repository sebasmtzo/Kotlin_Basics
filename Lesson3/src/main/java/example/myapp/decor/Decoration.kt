package example.myapp.decor


enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun testColorEnum() {
    println(Color.RED)
    println(Color.RED.rgb)
    println(Color.BLUE.name)
    println(Color.BLUE.ordinal)
}


data class Decoration(val rocks: String) {
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
}

data class Decoration2(
    val rocks: String,
    val wood: String,
    val diver: String
)

fun makeDecorations2() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    // Destructuring
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

    // Ignorar una propiedad
    val (rockOnly, _, diverOnly) = d5
    println(rockOnly)
    println(diverOnly)
}

fun main() {
    println("\n\n ================ Decorations ===============")
    makeDecorations()

    println("\n\n ================ Decorations 2 ===============")
    makeDecorations2()

    println("\n\n ================ Decorations ===============")
    testColorEnum()
}