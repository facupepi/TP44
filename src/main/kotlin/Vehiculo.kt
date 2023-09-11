//lase abstracta representa un tipo genérico de vehículo y define algunas propiedades y un método de representación en cadena.
abstract class Vehiculo(
    private var marca : String,
    var kilometraje : Int,
    var ruedas : Int,
) {
    override fun toString(): String {
        return "MARCA: $marca - KM: $kilometraje - RUEDAS: $ruedas"
        //Se construye y devuelve una cadena que contiene información sobre el vehículo.
    }
    //Se sobrescribe el método toString() de la clase base de Kotlin. Este método permite obtener una representación en cadena del objeto.
}
