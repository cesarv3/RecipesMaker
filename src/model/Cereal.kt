package model

class Cereal(cantidad: Int):Ingrediente(cantidad) {
    override fun toString(): String {
        return super.toString()+
                "1.-Avena\n" +
                "2.-Trigo\n" +
                "3.-Arroz\n" +
                "4.-Maiz\n"
    }
}