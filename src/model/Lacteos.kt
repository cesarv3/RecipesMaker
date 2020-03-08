package model

class Lacteos(cantidad: Int):Ingrediente(cantidad){
    override fun toString(): String {
        return super.toString()+
                "1.-Leche\n" +
                "2.-Queso\n" +
                "3.-Yogurt\n"
    }
}