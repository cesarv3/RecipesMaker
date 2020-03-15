package model

 class Ingrediente(var nombre: String, var cantidad: Int) {


    override fun toString(): String {
        return "Nombre: $nombre  Cantidad: $cantidad\n"
    }
}