fun main(args: Array<String>)
{
    do {
        mostrarMenu()
        val response: String? = readLine()
        when(response)
        {
            "1" -> println("Hacer una receta")
            "2" -> println("Ver mis recetas")
            "3" -> println("Adios")
            else -> println("Opcion invalida")
        }
    } while (!response.equals("3"))
}

fun mostrarMenu()
{
    println("Selecciona la opcion deseada\n" +
            "1. Hacer una receta\n" +
            "2. Ver mis recetas\n" +
            "3. Salir")
}