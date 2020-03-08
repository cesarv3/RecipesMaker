package model

class Carnes(cantidad: Int):Ingrediente(cantidad) {
    override fun toString(): String {
        return super.toString()+
                "1.-Res\n" +
                "2.-Pollo\n" +
                "3.-Huevos\n" +
                "4.-Pescado\n"
    }
}