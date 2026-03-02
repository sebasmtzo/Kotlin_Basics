package edu.example.actividad_lesson3

class Libro(
    titulo: String,
    anioPublicacion: Int
) : ElementoMultimedia(titulo, anioPublicacion), Prestable {

    override fun prestar() {
        println("Prestando el libro: $titulo")
    }

    companion object {
        const val TIPO_RECURSO = "Libro"
    }
}