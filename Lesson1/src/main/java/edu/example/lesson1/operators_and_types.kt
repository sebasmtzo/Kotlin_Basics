package edu.example.lesson1

fun main() {

    print("=== STEP 1: Numeric operators ===")

    // Operaciones basicas
    print(1 + 1)
    print(53 - 3)
    print(50 / 10)
    print(1.0 / 2.0)
    print(2.0 * 3.5)

    // Mezcla de tipos
    print(6 * 50)       // Int
    print(6.0 * 50.0)   // Double
    print(6.0 * 50)     // Double

    // Metodos sobre numeros
    print(2.times(3))
    print(3.5.plus(4))
    print(2.4.div(2))


    print("\n=== STEP 2: Practice using types ===")

    val i: Int = 6
    val b1 = i.toByte()
    print(b1)

    val b2: Byte = 1
    print(b2)

    // NO compila
    // val i1: Int = b2
    // val d1: Double = b2
    // val s1: String = b2

    // Casteo correcto
    val i4: Int = b2.toInt()
    val d2: Double = b2.toDouble()
    val s2: String = b2.toString()

    print(i4)
    print(d2)
    print(s2)

    // Numeros legibles
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val binaryBytes = 0b11010010_01101001_10010100_10010010

    print(oneMillion)
    print(socialSecurityNumber)
    print(hexBytes)
    print(binaryBytes)


    print("\n=== STEP 3: Value of variable types ===")

    var fish = 1
    fish = 2
    print(fish)

    val aquarium = 1
    // Error:
    // aquarium = 2

    var lakes: Double = 2.5
    print(lakes)


    print("\n=== STEP 4: strings and characters ===")

    val numberOfFish = 5
    val numberOfPlants = 12

    val message1 = "I have $numberOfFish fish and $numberOfPlants plants"
    print(message1)

    val message2 = "I have ${numberOfFish + numberOfPlants} fish and plants"
    print(message2)

    // Char vs String
    val letter: Char = 'A'
    val word: String = "Aquarium"

    print(letter)
    print(word)
}
