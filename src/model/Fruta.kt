package model

class Fruta(cantidad: Int):Ingrediente(cantidad) {
    override fun toString(): String {
        return super.toString()+
                "1.Fresa\n" +
                "2.-Platano\n" +
                "3.-Uvas\n" +
                "4.-Manzana\n" +
                "5.-Naranja\n" +
                "6.-Pera\n" +
                "7.-Cereza\n"
    }
}