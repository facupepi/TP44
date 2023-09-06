abstract class Vehiculo(
    private var marca : String,
    var kilometraje : Int,
    var ruedas : Int,
) {
    override fun toString(): String {
        return "MARCA: $marca - KM: $kilometraje - RUEDAS: $ruedas"
    }
}