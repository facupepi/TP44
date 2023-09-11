class Coche (
    marca : String,
    kilometraje : Int,
    ruedas : Int,
    private var puertas : Int,
    ) : Vehiculo(marca,kilometraje,ruedas)
//Se llama al constructor de la clase base Vehículo con los valores proporcionados para marca, kilometraje y ruedas.

{
    override fun toString(): String {
        return super.toString() + " - PUERTAS: $puertas \n"
    }
    /*
    Se llama al método toString() de la clase base Vehículo utilizando super.toString() para obtener la parte de la representación en cadena heredada.
    Luego, se concatena la información de la cantidad de puertas del automóvil y se devuelve la representación en cadena completa.
     */
}

/*
Es una clase concreta llamada Coche en Kotlin que hereda de la clase abstracta Vehículo. La clase Coche representa un tipo
específico de vehículo, un automóvil, y agrega una propiedad adicional para la cantidad de puertas.
 */