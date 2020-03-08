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

fun makeRecipe(){
    println("Selecciona por categoria el ingrediente que buscas\n" +
            "1.Agua\n" +
            "2. Leche\n" +
            "3. Carne\n" +
            "4. Verduras\n" +
            "5. Frutas\n" +
            "6. Cereal\n" +
            "7. Huevos\n" +
            "8. Aceites\n")
}

fun viewRecipe(){
    println("Ver mis recetas\n")
}