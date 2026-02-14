package edu.example.actividad_lesson1

fun esMayorDeEdad(edad: Int): Boolean
{
    return edad >= 18
}

fun main() {

    println("<<<<<<<<<<<<<< Registro simple de usuarios >>>>>>>>>>>>>>>")

    // Datos del usuario
    val nombre: String = "Juan"
    val edad: Int = 25
    val email: String? = null
    val suscripcionActiva: Boolean = true

    println("\n######### Datos del usuario #########")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Suscripcion activa: $suscripcionActiva")

    // Evaluación con if / else
    if (esMayorDeEdad(edad))
    {
        println("Acceso permitido")
    }
    else
    {
        println("Acceso denegado")
    }

    // Null safety (operador Elvis ?:)
    println("Email: ${email ?: "Email no registrado"}")

    // Lista de usuarios
    val usuarios = mutableListOf<String>()

    usuarios.add("Mateo")
    usuarios.add("Diego")
    usuarios.add("Pajarito")

    println("\nLista de usuarios registrados:")
    for (usuario in usuarios) {
        println(usuario)
    }

    // Uso de when
    val categoria = when {
        edad < 13 -> "Niño"
        edad in 13..17 -> "Adolescente"
        edad in 18..64 -> "Adulto"
        else -> "Adulto mayor"
    }

    println("\nClasificacion por edad: $categoria")
}