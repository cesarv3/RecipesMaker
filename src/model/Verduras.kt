package model

class Verduras(cantidad: Int):Ingrediente(cantidad) {
    override fun toString(): String {
        return super.toString()+
                "1.-Zanahoria\n" +
                "2.-Chayote\n" +
                "3.-Papa\n"
    }
}