package model

class Receta(nombre: String, list: List<Ingrediente>) {
    val nombre = nombre
    var list = list

    override fun toString(): String {
        return "La receta se compone de: " + list.toString()
    }
}