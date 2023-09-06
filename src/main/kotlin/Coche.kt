class Coche (
    marca : String,
    kilometraje : Int,
    ruedas : Int,
    private var puertas : Int,
    ) : Vehiculo(marca,kilometraje,ruedas)
{
    override fun toString(): String {
        return super.toString() + " - PUERTAS: $puertas \n"
    }
}