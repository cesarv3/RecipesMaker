package model

abstract class Ingrediente(var cantidad: Int) {
    override fun toString(): String {
        return "Cantidad: $cantidad\n"
    }
}