import model.*

val listaRecetas = mutableListOf<Receta>()
fun main(args: Array<String>)
{

    do {
        mostrarMenu()
        val response: String? = readLine()
        when(response)
        {
            "1" -> makeRecipe()
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

fun llenarIngredientes(list: List<String>): MutableList<Ingrediente>?{
    var lista: MutableList<Ingrediente>? = mutableListOf()
    for (item in list)
    {
        lista?.add(Ingrediente(item,0))
    }
    return lista
}

fun makeRecipe(){
    val aguas = listOf("Agua natural","Agua de sabor","Agua mineral")
    val aguasIng = llenarIngredientes(aguas)
    val aceites = listOf("Aceite Canola","Aceite de Coco")
    val aceitesIng = llenarIngredientes(aceites)
    val carnes = listOf("Res","Pollo", "Huevos", "Pescado")
    val carnesIng = llenarIngredientes(carnes)
    val cereales = listOf("Avena", "Trigo", "Arroz", "Maiz")
    val cerealesIng = llenarIngredientes(cereales)
    val frutas = listOf("Fresa","Platano", "Uvas", "Manzana", "Naranja","Pera", "Cereza")
    val frutasIng = llenarIngredientes(frutas)
    val lacteos = listOf("Leche", "Queso", "Yogurt")
    val lacteosIng = llenarIngredientes(lacteos)
    val verduras = listOf("Zanahoria", "Chayote","Papa")
    val verdurasIng = llenarIngredientes(verduras)
    val listaTemp = mutableListOf<Ingrediente>()

    do {
        println("Selecciona por categoria el ingrediente que buscas\n" +
                "1.Agua\n" +
                "2. Leche\n" +
                "3. Carne\n" +
                "4. Verduras\n" +
                "5. Frutas\n" +
                "6. Cereal\n" +
                "7. Aceites\n" +
                "9. Terminar\n"
        )
        val response = readLine()
        if (response != "9")
        {
            var lista: MutableList<Ingrediente>? = mutableListOf()
            when(response)
            {
                "1" -> lista = aguasIng
                "2" -> lista = lacteosIng
                "3" -> lista = carnesIng
                "4" -> lista = verdurasIng
                "5" -> lista = frutasIng
                "6" -> lista = cerealesIng
                "7" -> lista = aceitesIng
                else ->  "Opcion invalida"
            }
            mostrarLista(lista)
            val nombreIng = lista?.get(readLine().toString().toInt())?.nombre
            val cant = ingresarCantidad()
            nombreIng?.let { cant?.toInt()?.let { it1 -> Ingrediente(it, it1) } }?.let { listaTemp.add(it) }
        }

    } while (response != "9")
    if (listaTemp.isNotEmpty())
    {
        println("Cual es el nombre de la receta?")
        readLine()?.let { Receta(it,listaTemp) }?.let { listaRecetas.add(it) }

    }




}

fun viewRecipe(){
    println("Ver mis recetas\n")
    for (receta in listaRecetas)
    {
        println("Receta: ${receta.nombre}")
        for (ingredientes in receta.list)
        {
            println("${ingredientes.nombre} Cantidad: ${ingredientes.cantidad}")
        }
    }
}

fun mostrarLista(list: List<Ingrediente>?){
    println("Selecciona un ingrediente")
    if (list != null) {
        for ((index, value) in list.withIndex()) {
            println("$index.- "+"${value.nombre}")
        }
    }
}

fun ingresarCantidad():String?{
    println("Ingresa la cantidad")
    return readLine()
}