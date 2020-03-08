package model

class Aceites(cantidad: Int):Ingrediente(cantidad) {
    override fun toString(): String {
        return super.toString()+
                "1.-Aceite Canola\n" +
                "2.-Aceite de Coco\n"
    }
}