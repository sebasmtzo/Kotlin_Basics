package edu.example.actividad_lesson2


// Funciones de orden superior
// Paso 6
fun filtrarInstrumentos(
    lista: List<Pair<String, Double>>,
    criterio: (Pair<String, Double>) -> Boolean
): List<Pair<String, Double>> {
    return lista.filter(criterio)
}

// Paso 7
fun <T> transformarInstrumentos(
    lista: List<Pair<String, Double>>,
    transformacion: (Pair<String, Double>) -> T
): List<T> {
    return lista.map(transformacion)
}

// Paso 8
fun calcular(
    lista: List<Pair<String, Double>>,
    operacion: (List<Pair<String, Double>>) -> Double
): Double {
    return operacion(lista)
}

fun main() {

    // Paso 0 — Crear el proyecto
    println("Taller: Laboratorio de automatizacion")


    // Paso 1 — Lista de instrumentos
    val instrumentos = listOf(
        Pair("Osciloscopio Digital", 1500.0),
        Pair("Voltimetro Digital", 120.0),
        Pair("Generador de Ondas", 980.0),
        Pair("Cable BNC", 15.0),
        Pair("Resistencia 1kΩ", 0.10),
        Pair("Protoboard", 25.0)
    )

    println("\nLista completa de instrumentos:")
    instrumentos.forEach { println("${it.first} -> ${it.second}") }


    // Paso 2 — filter
    val costosos = instrumentos.filter { it.second > 500 }

    println("\nInstrumentos costosos (> 500):")
    costosos.forEach { println(it.first) }

    // Segundo filtro (mini-reto)
    val mayoresA100 = instrumentos.filter { it.second > 100 }

    println("\nInstrumentos mayores a 100:")
    mayoresA100.forEach { println(it.first) }


    // Paso 3 — map
    val nombres = instrumentos.map { it.first }

    println("\nNombres de instrumentos:")
    nombres.forEach { println(it) }

    // Transformación tipo texto
    val descripcion = instrumentos.map {
        "${it.first} cuesta ${it.second}"
    }

    println("\nDescripcion completa:")
    descripcion.forEach { println(it) }


    // Paso 4 — sumOf
    val total = instrumentos.sumOf { it.second }
    println("\nCosto total del laboratorio: $total")

    // Total solo > 100
    val totalMayoresA100 = instrumentos
        .filter { it.second > 100 }
        .sumOf { it.second }

    println("Total de instrumentos > 100: $totalMayoresA100")


    // Paso 5 — sortedBy
    val ordenados = instrumentos.sortedBy { it.second }

    println("\nInstrumentos ordenados por precio (menor a mayor):")
    ordenados.forEach { println("${it.first} - ${it.second}") }

    val ordenadosDesc = instrumentos.sortedByDescending { it.second }

    println("\nInstrumentos ordenados (mayor a menor):")
    ordenadosDesc.forEach { println("${it.first} - ${it.second}") }


    // Paso 6 — Función de orden superior (filtrar)
    val costosos2 = filtrarInstrumentos(instrumentos) { it.second > 500 }

    println("\n(Con funcion de orden superior) Costosos (> 500):")
    costosos2.forEach { println(it.first) }

    // Filtrar cables
    val cables = filtrarInstrumentos(instrumentos) {
        it.first.contains("Cable")
    }

    println("\nCables encontrados:")
    cables.forEach { println(it.first) }


    // Paso 7 — Función de orden superior (transformar)
    val nombres2 = transformarInstrumentos(instrumentos) { it.first }

    println("\n(Con funcion de orden superior) Nombres:")
    nombres2.forEach { println(it) }

    val precios2 = transformarInstrumentos(instrumentos) { it.second }

    println("\n(Con funcion de orden superior) Precios:")
    precios2.forEach { println(it) }


    // Paso 8 — Función de orden superior (calcular)
    val total2 = calcular(instrumentos) { lista ->
        lista.sumOf { it.second }
    }

    println("\n(Con funcion de orden superior) Total: $total2")

    // Total solo instrumentos de medición
    val totalMedicion = calcular(instrumentos) { lista ->
        lista
            .filter {
                it.first.contains("Osciloscopio") ||
                        it.first.contains("Voltimetro")
            }
            .sumOf { it.second }
    }

    println("Total instrumentos de medicion: $totalMedicion")
}