package model

class Agua(cantidad: Int):Ingrediente(cantidad) {
    override fun toString(): String {
        return super.toString() +
                "1.-Agua natural\n" +
                "2.-Agua de sabor\n" +
                "3.-Agua mineral\n"
    }
}