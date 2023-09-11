class Moto(
    marca : String,
    kilometraje : Int,
    ruedas : Int,
    private var cilindrada : Int,

    ) : Vehiculo(marca,kilometraje,ruedas)
// Se llama al constructor de la clase base Vehiculo con los valores proporcionados para marca, kilometraje y ruedas. \

{
    override fun toString(): String {
        return super.toString() + " - CILINDRADA: $cilindrada \n"
    }
    /*
     Aquí se sobrescribe el método toString() heredado de la clase Vehículo.
     Esta implementación personalizada permite obtener una representación en cadena de la motocicleta.
     */
}

/*
La clase Moto representa un tipo específico de vehículo y agrega una propiedad adicional para la cilindrada
 */