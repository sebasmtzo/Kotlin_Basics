package edu.example.actividad_lesson3

fun main() {
    val libro1 = Libro("Cien anos de soledad", 1967)
    val libro2 = Libro("Don Quijote de la Mancha", 1605)

    // Acceso a propiedades
    println("Titulo: ${libro1.titulo}, Ano: ${libro1.anioPublicacion}")
    println("Titulo: ${libro2.titulo}, Ano: ${libro2.anioPublicacion}")

    // Llamada a metodo de la interfaz
    libro1.prestar()
    libro2.prestar()

    // Llamada a función de extensión
    println("${libro1.titulo} es antiguo? ${libro1.esAntiguo()}")
    println("${libro2.titulo} es antiguo? ${libro2.esAntiguo()}")

    // Companion object
    println("Tipo de recurso: ${Libro.TIPO_RECURSO}")
}