import model.*

fun main(args: Array<String>)
{
    do {
        mostrarMenu()
        val response: String? = readLine()
        when(response)
        {
            "1" -> println(makeRecipe())
            "2" -> viewRecipe()
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

fun makeRecipe():String{
    println("Selecciona por categoria el ingrediente que buscas\n" +
            "1.Agua\n" +
            "2. Leche\n" +
            "3. Carne\n" +
            "4. Verduras\n" +
            "5. Frutas\n" +
            "6. Cereal\n" +
            "7. Huevos\n" +
            "8. Aceites\n")

   return when(readLine())
    {
        "1" ->  Agua(1).toString()
        "2" ->  Lacteos(2).toString()
        "3" ->  Carnes(3).toString()
        "4" ->  Verduras(4).toString()
        "5" ->  Fruta(5).toString()
        "6" ->  Cereal(6).toString()
        "7" ->  Carnes(7).toString()
        "8" ->  Aceites(8).toString()
        else ->  "Opcion invalida"
    }
}

fun viewRecipe(){
    println("Ver mis recetas\n")
}